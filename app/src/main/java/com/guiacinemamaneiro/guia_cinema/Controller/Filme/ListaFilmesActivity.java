package com.guiacinemamaneiro.guia_cinema.Controller.Filme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Cinema;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;
import com.guiacinemamaneiro.guia_cinema.R;

import java.util.ArrayList;

import static com.guiacinemamaneiro.guia_cinema.Controller.Cinema.ListaCinemasActivity.NOME_CAMPO_CINEMA;

public class ListaFilmesActivity extends AppCompatActivity {

    ListView listViewFilme;
    ArrayList<Filme> listaFilme;
    ArrayAdapter<Filme> adaptador;
    private Cinema cinema;

    public static final String NOME_CAMPO_FILME = "FILME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        //pega o cinema enviado pela activity DetalhesCinemas
        Bundle bundle = getIntent().getExtras();
        try {

            if (bundle.containsKey(NOME_CAMPO_CINEMA)) cinema = (Cinema) bundle.getSerializable(NOME_CAMPO_CINEMA);
            buscaFilmes(cinema);

        } catch (Exception e) {
            e.printStackTrace();
        }


        listViewFilme = (ListView) findViewById(R.id.lista_filme);
        adaptador = new ArrayAdapter<>(ListaFilmesActivity.this, android.R.layout.simple_list_item_1, listaFilme);
        listViewFilme.setAdapter(adaptador);


        listViewFilme.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListaFilmesActivity.this, DetalhesFilmeActivity.class);
                i.putExtra(NOME_CAMPO_FILME ,listaFilme.get(position));
                startActivity(i);
            }
        });

    }

    private void buscaFilmes(Cinema cinema) {
        listaFilme = new ArrayList<>();
        //TODO: Buscar filmes e preencher o array
    }
}
