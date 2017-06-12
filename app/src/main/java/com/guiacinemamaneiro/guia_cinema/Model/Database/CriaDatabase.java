package com.guiacinemamaneiro.guia_cinema.Model.Database;

/**
 * Created by Daniel Kock on 12/06/2017.
 */

/**
 * Created by Daniel on 13/11/2015.
 */
import android.content.Context;
import android.database.sqlite.*;

public class CriaDatabase extends SQLiteOpenHelper {

    public CriaDatabase(Context context) {

        super(context, "my_db_sqlite", null, 1);
    }

    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.createAtor());
        db.execSQL(ScriptSQL.createCinema());
        db.execSQL(ScriptSQL.createElenco());
        db.execSQL(ScriptSQL.createFavoritos());
        db.execSQL(ScriptSQL.createFilme());
        db.execSQL(ScriptSQL.createSala());
        db.execSQL(ScriptSQL.createSessao());
        db.execSQL(ScriptSQL.createUsuario());
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}