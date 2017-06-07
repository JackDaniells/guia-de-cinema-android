package com.guiacinemamaneiro.guia_cinema.Controller.Filme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;
import com.guiacinemamaneiro.guia_cinema.R;

import java.util.ArrayList;

public class ListaFilmesActivity extends AppCompatActivity {

    ListView listViewFilme;
    ArrayList listaFilme;
    ArrayAdapter<Filme> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        listViewFilme = (ListView) findViewById(R.id.lista_filme);

        listaFilme = new ArrayList<>();
        Filme f = new Filme();
        listaFilme.add(f);

        adaptador = new ArrayAdapter<>(ListaFilmesActivity.this, android.R.layout.simple_list_item_1, listaFilme);
        listViewFilme.setAdapter(adaptador);


        listViewFilme.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO
            }
        });

    }
}
