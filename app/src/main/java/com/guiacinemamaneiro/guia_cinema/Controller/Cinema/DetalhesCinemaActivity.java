package com.guiacinemamaneiro.guia_cinema.Controller.Cinema;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guiacinemamaneiro.guia_cinema.Controller.Filme.DetalhesFilmeActivity;
import com.guiacinemamaneiro.guia_cinema.R;

import com.guiacinemamaneiro.guia_cinema.Controller.Filme.ListaFilmesActivity;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Cinema;

import java.io.InputStream;

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


        fotoCinema = (ImageView)findViewById(R.id.imageViewFotoCinema);
        nome = (TextView) findViewById(R.id.textViewNomeCinema);
        verMapa = (Button)findViewById(R.id.buttonVerMapa);
        verFilmes = (Button)findViewById(R.id.buttonVerFilmes);


        //pega o cinema enviado pela activity ListaCinemas
        Bundle bundle = getIntent().getExtras();
        try {
            if (bundle.containsKey(NOME_CAMPO_CINEMA)) cinema = (Cinema) bundle.getSerializable(NOME_CAMPO_CINEMA);
            new DetalhesCinemaActivity.DownloadImageTask(fotoCinema).execute(cinema.getFoto());
            nome.setText(cinema.getNome());


        } catch (Exception e) {
                e.printStackTrace();
        }



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

                String strUri = "http://maps.google.com/maps?q=loc:" + cinema.getLatitude() + "," + cinema.getLongitude() + " (" + cinema.getNome() + ")";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(strUri));

                intent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");

                startActivity(intent);
            }
        });

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
