package com.guiacinemamaneiro.guia_cinema.Model.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLException;

/**
 * Created by Daniel Kock on 12/06/2017.
 */

public class ConectaDatabase {

    public static SQLiteDatabase conn;
    public static final String TAG = "DATABASE";

    public static void conecta(Context context) {

        CriaDatabase database = new CriaDatabase(context);
        conn = database.getWritableDatabase();
        System.out.println("Conectou ao Banco de Dados");

    }
}//

