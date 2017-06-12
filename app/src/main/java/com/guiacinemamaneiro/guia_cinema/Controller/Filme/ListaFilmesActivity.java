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
        } catch (Exception e) {
            e.printStackTrace();
        }
        buscaFilmes();

        listViewFilme = (ListView) findViewById(R.id.view_lista_filme);
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

    private void buscaFilmes() {
        listaFilme = new ArrayList<>();
        //TODO: Buscar filmes e preencher o array

        //String titulo, String diretor, String[] elenco, String poster, String sinopse,
        // int duracao, boolean legendado, String trailer, String genero)

        //filme 1
        String[] atoresBatman = new String[3];
        atoresBatman[0] = "Ben Affleck";
        atoresBatman[1] = "Henry Cavill";
        atoresBatman[2] = "Amy Adams";

        Filme batima = new Filme(
                "Batman vs Superman",
                "Zack Snyder",
                atoresBatman,
                "https://images-na.ssl-images-amazon.com/images/M/MV5BYThjYzcyYzItNTVjNy00NDk0LTgwMWQtYjMwNmNlNWJhMzMyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,675,1000_AL_.jpg",
                "Fearing that the actions of Superman are left unchecked, Batman takes on the Man of Steel, while the world wrestles with what kind of a hero it really needs. ",
                151,
                true,
                "https://www.youtube.com/embed/IHDgrNxO-5I",
                "Ação"
                );

        listaFilme.add(batima);

        String[] atoresHomiArania = new String[3];
        atoresHomiArania[0] = "Tom Holland";
        atoresHomiArania[1] = "Chris Evans";
        atoresHomiArania[2] = "Martin Starr";

        Filme homi_arania = new Filme(
                "Homem Aranha - De volta ao Lar",
                " Jon Watts ",
                atoresHomiArania,
                "https://images-na.ssl-images-amazon.com/images/M/MV5BNTk4ODQ1MzgzNl5BMl5BanBnXkFtZTgwMTMyMzM4MTI@._V1_UX182_CR0,0,182,268_AL_.jpg ",
                "Following the events of Capitain America: Guerra Civil (2016), Peter Parker attempts to balance his life in high school with his career as the web-slinging superhero Spider-Man. ",
                200,
                true,
                "https://www.youtube.com/watch?v=5U4rsRADlmo",
                "Ação"
        );

        listaFilme.add(homi_arania);

        String[] atorasFestaDaSalsicha = new String[3];
        atorasFestaDaSalsicha[0] = "Seth Rogen";
        atorasFestaDaSalsicha[1] = "Kristen Wiig";
        atorasFestaDaSalsicha[2] = "Jonah Hill";

        Filme festa_da_salsicha = new Filme(
                "Homem Aranha - De volta ao Lar",
                " Greg Tiernan, Conrad Vernon ",
                atoresHomiArania,
                "https://images-na.ssl-images-amazon.com/images/M/MV5BMjkxOTk1MzY4MF5BMl5BanBnXkFtZTgwODQzOTU5ODE@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "A sausage strives to discover the truth about his existence.",
                89,
                true,
                "https://www.youtube.com/watch?v=FNP0N_QcfFU",
                "Comédia"
        );


        listaFilme.add(festa_da_salsicha);

    }
}
