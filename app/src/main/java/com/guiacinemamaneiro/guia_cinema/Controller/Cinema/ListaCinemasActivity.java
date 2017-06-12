package com.guiacinemamaneiro.guia_cinema.Controller.Cinema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Cinema;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Sala;
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

        listaCinema = (ListView)findViewById(R.id.list_view_cinemas);

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


        Sala[] s = new Sala[1];
        s[0] = new Sala();


        Cinema c = new Cinema(s,"Iguatemi",-27.5900291, -48.5161127, "https://aovivonaweb.tv/uploaded/files/blog/56537e10abfd49c270b8f5fc/Interno_SalaCinema-2.jpg");
        Cinema c2 = new Cinema(s,"Beira Mar Shopping", -27.5542414,-48.5004699, "https://aovivonaweb.tv/uploaded/files/blog/56537e10abfd49c270b8f5fc/Interno_SalaCinema-2.jpg");
        Cinema c3 = new Cinema(s,"Floripa Shopping", -27.5846722,-48.5472427, "https://aovivonaweb.tv/uploaded/files/blog/56537e10abfd49c270b8f5fc/Interno_SalaCinema-2.jpg");
        cinemas.add(c);
        cinemas.add(c2);
        cinemas.add(c3);
        //TODO: Retornar os cinemas
    }
}
