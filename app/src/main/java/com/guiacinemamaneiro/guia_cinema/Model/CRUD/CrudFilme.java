package com.guiacinemamaneiro.guia_cinema.Model.CRUD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.ArrayAdapter;

import com.guiacinemamaneiro.guia_cinema.Model.Database.ConectaDatabase;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;

import java.util.ArrayList;

/**
 * Created by Daniel Kock on 12/06/2017.
 */

public class CrudFilme extends ConectaDatabase {

    /****************Repositorio Extensor **********************/

    public static void inserir(Filme filme) {

        ContentValues values = new ContentValues();
        values.put("TITULO", filme.getTitulo());
        values.put("DIRETOR", filme.getDiretor());
        values.put("POSTER", filme.getPoster());
        values.put("SINOPSE", filme.getSinopse());
        values.put("DURACAO", filme.getDuracao());
        values.put("LEGENDADO", filme.isLegendado());

        conn.insertOrThrow("FILME", null, values);

    }

    public static ArrayList<Filme> buscaFilmes() {
        ArrayList<Filme> filmes = new ArrayList<>();

        String where = null;
        Cursor cursor = conn.query("FILME", null, where, null, null, null, null);

        if (cursor.getCount() > 0) {
            cursor.moveToFirst();

            do {

                Filme filme = new Filme();

                filme.setDiretor(cursor.getString(cursor.getColumnIndex("DIRETOR")));
                filme.setDuracao(cursor.getInt(cursor.getColumnIndex("DURACAO")));
                filme.setGenero(cursor.getString(cursor.getColumnIndex("GENERO")));
                filme.setPoster(cursor.getString(cursor.getColumnIndex("POSTER")));
                filme.setSinopse(cursor.getString(cursor.getColumnIndex("SINOPSE")));
                filme.setTrailer(cursor.getString(cursor.getColumnIndex("TRAILER")));
                filme.setTitulo(cursor.getString(cursor.getColumnIndex("TITULO")));

                filmes.add(filme);

            } while (cursor.moveToNext());
        }
        cursor.close();
        return filmes;
    }

    public static boolean deleteFilme(int id) {
        return conn.delete("FILME", "_id" + "=" + id, null) > 0;
    }

}
