package com.guiacinemamaneiro.guia_cinema.Controller.Sala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Sala;
import com.guiacinemamaneiro.guia_cinema.R;

import java.util.ArrayList;

public class ListaSalasActivity extends AppCompatActivity {

    ListView listViewSala;
    ArrayList listaSala;
    ArrayAdapter<Sala> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);

        listViewSala = (ListView) findViewById(R.id.view_lista_filme);

        listaSala = new ArrayList<>();
        Sala s = new Sala();
        listaSala.add(s);

        adaptador = new ArrayAdapter<>(ListaSalasActivity.this, android.R.layout.simple_list_item_1, listaSala);
        listViewSala.setAdapter(adaptador);


        listViewSala.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO
            }
        });

    }
}