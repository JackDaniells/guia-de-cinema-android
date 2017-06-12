package com.guiacinemamaneiro.guia_cinema.Controller.Cinema;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guiacinemamaneiro.guia_cinema.Controller.Filme.ListaFilmesActivity;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Cinema;

import static com.guiacinemamaneiro.guia_cinema.Controller.Cinema.ListaCinemasActivity.NOME_CAMPO_CINEMA;


public class DetalhesCinemaActivity extends AppCompatActivity {


    private Cinema cinema;
    private ImageView fotoCinema;
    private TextView nome, localizacao;
    private Button verMapa,verFilmes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_cinema);

        //pega o cinema enviado pela activity ListaCinemas
        Bundle bundle = getIntent().getExtras();
        try {
            if (bundle.containsKey(NOME_CAMPO_CINEMA)) cinema = (Cinema) bundle.getSerializable(NOME_CAMPO_CINEMA);
        } catch (Exception e) {
                e.printStackTrace();
        }


        fotoCinema = (ImageView)findViewById(R.id.imageViewFotoCinema);
        nome = (TextView) findViewById(R.id.textViewNomeCinema);
        localizacao = (TextView) findViewById(R.id.textViewLocalizacaoCinema);
        verMapa = (Button)findViewById(R.id.buttonVerMapa);
        verFilmes = (Button)findViewById(R.id.buttonVerFilmes);

        verFilmes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetalhesCinemaActivity.this, ListaFilmesActivity.class);
                i.putExtra(NOME_CAMPO_CINEMA, cinema);
                startActivity(i);
            }
        });

        verMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Mostrar mapa quando clicar no botao
            }
        });

    }
}
