package com.guiacinemamaneiro.guia_cinema.Controller.Filme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guiacinemamaneiro.guia_cinema.R;

public class DetalhesFilmeActivity extends AppCompatActivity {

    Button trailer;
    TextView titulo, duracao, genero, elenco, sinopse, diretor;
    ImageView poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filme);

        trailer = (Button)findViewById(R.id.ButtonVerTrailerFilme);
        poster = (ImageView)findViewById(R.id.imageViewBannerFilme);
        titulo = (TextView)findViewById(R.id.textViewTituloFilme);
        duracao = (TextView)findViewById(R.id.textViewDuracaoFilme);
        genero = (TextView)findViewById(R.id.textViewGeneroFilme);
        elenco = (TextView)findViewById(R.id.textViewElencoFilme);
        sinopse = (TextView)findViewById(R.id.textViewSinopseFilme);
        diretor = (TextView)findViewById(R.id.textViewDiretorFilme);


        trailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
