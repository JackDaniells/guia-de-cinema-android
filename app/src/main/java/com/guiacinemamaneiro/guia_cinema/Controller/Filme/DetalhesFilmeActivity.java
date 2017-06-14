package com.guiacinemamaneiro.guia_cinema.Controller.Filme;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.VideoView;

import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;
import com.guiacinemamaneiro.guia_cinema.R;

import java.io.InputStream;

import static com.guiacinemamaneiro.guia_cinema.Controller.Cinema.ListaCinemasActivity.NOME_CAMPO_CINEMA;
import static com.guiacinemamaneiro.guia_cinema.Controller.Filme.ListaFilmesActivity.NOME_CAMPO_FILME;

public class DetalhesFilmeActivity extends AppCompatActivity {

    private Filme filme;

    Button btnTrailer;
    TextView titulo, duracao, genero, elenco, sinopse, diretor;
    ImageView poster;
    VideoView trailer;
    LinearLayout telaPrincipal, telaTrailer;
    Switch favorito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_filme);

        btnTrailer= (Button)findViewById(R.id.ButtonVerTrailerFilme);
        poster = (ImageView)findViewById(R.id.imageViewBannerFilme);
        titulo = (TextView)findViewById(R.id.textViewTituloFilme);
        duracao = (TextView)findViewById(R.id.textViewDuracaoFilme);
        genero = (TextView)findViewById(R.id.textViewGeneroFilme);
        elenco = (TextView)findViewById(R.id.textViewElencoFilme);
        sinopse = (TextView)findViewById(R.id.textViewSinopseFilme);
        diretor = (TextView)findViewById(R.id.textViewDiretorFilme);
        telaPrincipal = (LinearLayout)findViewById(R.id.layout_detalhes_filme);
        favorito = (Switch)findViewById(R.id.switchFavorito);




        //pega o cinema enviado pela activity ListaCinemas
        Bundle bundle = getIntent().getExtras();
        try {
            if (bundle.containsKey(NOME_CAMPO_FILME)) filme = (Filme) bundle.getSerializable(NOME_CAMPO_FILME);
            new DownloadImageTask(poster).execute(filme.getPoster());
            titulo.setText(filme.getTitulo());
            duracao.setText("Duração: " + filme.getDuracao() + " mins");
            genero.setText("Genero: " + filme.getGenero());
            sinopse.setText(filme.getSinopse());
            diretor.setText("Diretor: " + filme.getDiretor());
            String atores = "";
            for(String ator: filme.getElenco()){
                atores += ator + ", ";
            }
            atores.substring(0, atores.length() - 2);
            elenco.setText(atores);
            if(filme.isFavorito())favorito.setChecked(true);




        } catch (Exception e) {
            e.printStackTrace();
        }
        favorito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                filme.setFavorito(isChecked);
            }
        });

        //ver trailer
        btnTrailer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passarVideoYoutube(filme.getTrailer());
            }
        });

        //voltar para a tela de detalhes

    }


    //exibe o video no VideoView
    private void passarVideoYoutube(String videoURL){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(filme.getTrailer())));
    }


    //favoritar filme
    private void favoritarFilme(Filme filme){
        //TODO: fazer o favoritar filme
    }


    //busca a imagem pra aparecer na tela
    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
