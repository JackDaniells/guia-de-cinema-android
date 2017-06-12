package com.guiacinemamaneiro.guia_cinema.Controller.Cinema;

import android.content.Intent;
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
    ArrayList<Cinema>  cinemas;
    ArrayAdapter<Cinema> adaptador;

    public static final String NOME_CAMPO_CINEMA = "CINEMA";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cinemas);

        listaCinema = (ListView)findViewById(R.id.lista_cinema);

        buscaCinemas();

        adaptador = new ArrayAdapter<>(ListaCinemasActivity.this, android.R.layout.simple_list_item_1, cinemas);
        listaCinema.setAdapter(adaptador);


        listaCinema.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(ListaCinemasActivity.this, DetalhesCinemaActivity.class);
                i.putExtra(NOME_CAMPO_CINEMA ,cinemas.get(position));
                startActivity(i);
            }
        });


    }

    private void buscaCinemas(){
        cinemas = new ArrayList<>();

        //TODO: Retornar os cinemas
    }
}
