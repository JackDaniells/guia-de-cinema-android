package com.guiacinemamaneiro.guia_cinema.Model.CRUD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.ArrayAdapter;

import com.guiacinemamaneiro.guia_cinema.Model.Database.ConectaDatabase;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Filme;

import java.util.ArrayList;

/**
 * Created by Daniel Kock on 12/06/2017.
 */

public class CrudFilme extends ConectaDatabase {



    public static Filme batima = new Filme(
            "Batman vs Superman",
            "Zack Snyder",
            new String[]{"Ben Affleck", "Henry Cavill", "Amy Adams"},
            "https://images-na.ssl-images-amazon.com/images/M/MV5BYThjYzcyYzItNTVjNy00NDk0LTgwMWQtYjMwNmNlNWJhMzMyXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SY1000_CR0,0,675,1000_AL_.jpg",
            "O confronto entre Superman e Zod em Metrópolis fez com que a população mundial se dividisse acerca da existência de extra-terrestres na Terra. Enquanto muitos consideram o Superman como um novo deus, há aqueles que consideram extremamente perigoso que haja um ser tão poderoso sem qualquer tipo de controle. Bruce Wayne (Ben Affleck) é um dos que acreditam nesta segunda hipótese. Sob o manto de um Batman violento e obcecado, ele investiga o laboratório de Lex Luthor (Jesse Eisenberg), que descobriu uma pedra verde que consegue eliminar e enfraquecer os filhos de Krypton. ",
            151,
            true,
            "https://www.youtube.com/embed/IHDgrNxO-5I",
            "Ação"
    );

    public static Filme homi_arania = new Filme(
            "Homem Aranha",
            " Jon Watts ",
            new String[]{"Tom Holland", "Chris Evans", "Martin Starr"},
            "https://images-na.ssl-images-amazon.com/images/M/MV5BNTk4ODQ1MzgzNl5BMl5BanBnXkFtZTgwMTMyMzM4MTI@._V1_UX182_CR0,0,182,268_AL_.jpg ",
            "Depois de atuar ao lado dos Vingadores, chegou a hora do pequeno Peter Parker (Tom Holland) voltar para casa e para a sua vida, já não mais tão normal. Lutando diariamente contra pequenos crimes nas redondezas, ele pensa ter encontrado a missão de sua vida quando o terrível vilão Abutre (Michael Keaton) surge amedrontando a cidade. O problema é que a tarefa não será tão fácil como ele imaginava.",
            200,
            true,
            "https://www.youtube.com/watch?v=5U4rsRADlmo",
            "Ação"
    );

    public static Filme festa_da_salsicha = new Filme(
            "Festa da Salsicha",
            " Greg Tiernan, Conrad Vernon ",
            new String[]{ "Seth Rogen", "Kristen Wiig", "Jonah Hill"},
            "https://images-na.ssl-images-amazon.com/images/M/MV5BMjkxOTk1MzY4MF5BMl5BanBnXkFtZTgwODQzOTU5ODE@._V1_UX182_CR0,0,182,268_AL_.jpg",
            "Dentro de um supermercado, os alimentos pensam que as pessoas são deuses. Eles sonham em serem escolhidos por elas e serem levados para suas casas, onde pensam que viverão felizes. Mas eles nem suspeitam que serão cortados, ralados, cozidos e devorados! Quando Frank, uma salsicha, descobre a terrível verdade, ele precisa convencer os outros alimentos do supermecado  e fazer com que eles lutem contra os humanos. ",
            89,
            true,
            "https://www.youtube.com/watch?v=FNP0N_QcfFU",
            "Comédia"
    );

    public static ArrayList<Filme> buscaFilme(boolean favorito){
        ArrayList<Filme> listaFilme = new ArrayList<>();

        if (favorito){

            if(batima.isFavorito())listaFilme.add(batima);
            if(homi_arania.isFavorito())listaFilme.add(homi_arania);
            if(festa_da_salsicha.isFavorito())listaFilme.add(festa_da_salsicha);

        }else{
            listaFilme.add(batima);
            listaFilme.add(homi_arania);
            listaFilme.add(festa_da_salsicha);
        }
        return listaFilme;
    }


}
