package com.guiacinemamaneiro.guia_cinema.Controller.Cinema;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Cinema;
import com.guiacinemamaneiro.guia_cinema.R;

import java.util.ArrayList;

public class ListaCinemasActivity extends AppCompatActivity {

    ListView listaCinema;
    ArrayList cinemas;
    ArrayAdapter<Cinema> adaptador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cinemas);

        listaCinema = (ListView)findViewById(R.id.lista_cinema);


        cinemas = new ArrayList<>();
        Cinema c = new Cinema("Teste", "1");
        cinemas.add(c);


        adaptador = new ArrayAdapter<>(ListaCinemasActivity.this, android.R.layout.simple_list_item_1, cinemas);
        listaCinema.setAdapter(adaptador);


        listaCinema.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //TODO
            }
        });


    }
}
