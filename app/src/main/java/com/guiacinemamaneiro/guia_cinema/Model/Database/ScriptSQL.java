package com.guiacinemamaneiro.guia_cinema.Model.Database;

/**
 * Created by Daniel on 13/11/2015.
 */
public class ScriptSQL {

    public static String createUsuario(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS USUARIO(");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("NOME VARCHAR(50) NOT NULL ,");
        sqlBuilder.append("ENDERECO VARCHAR(500),");
        sqlBuilder.append("LOGIN VARCHAR(50) NOT NULL,");
        sqlBuilder.append("SENHA VARCHAR(50) NOT NULL");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

    public static String createFavoritos(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS FAVORITOS(");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("ID_USUARIO INTEGER NOT NULL ,");
        sqlBuilder.append("ID_FILME INTEGER NOT NULL ,");
        sqlBuilder.append("FOREIGN KEY(ID_USUARIO) REFERENCES USUARIO(ID_USUARIO),");
        sqlBuilder.append("FOREIGN KEY(ID_FILME) REFERENCES FILME(ID_FILME)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }


    public static String createCinema(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS CINEMA( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("NOME VARCHAR(200) NOT NULL, ");
        sqlBuilder.append("LAT REAL NOT NULL, ");
        sqlBuilder.append("LONG REAL NOT NULL, ");
        sqlBuilder.append("FOTO VARCHAR(1000),");
        sqlBuilder.append("ID_SALA INTEGER NOT NULL,");
        sqlBuilder.append("FOREIGN KEY(ID_SALA) REFERENCES SALA(ID_SALA)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }


    public static String createFilme(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS FILME( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("TITULO VARCHAR(1000) NOT NULL, ");
        sqlBuilder.append("DIRETOR VARCHAR(500), ");
        sqlBuilder.append("POSTER VARCHAR(1000), ");
        sqlBuilder.append("SINOPSE VARCHAR(5000),");
        sqlBuilder.append("DURACAO INTEGER,");
        sqlBuilder.append("LEGENDADO BOOLEAN");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }


    public static String createElenco(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS ELENCO( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("ID_FILME INTEGER NOT NULL, ");
        sqlBuilder.append("ID_ATOR INTEGER NOT NULL,");
        sqlBuilder.append("FOREIGN KEY(ID_ATOR) REFERENCES ATOR(ID_ATOR),");
        sqlBuilder.append("FOREIGN KEY(ID_FILME) REFERENCES FILME(ID_FILME)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

    public static String createAtor(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS ELENCO( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("NOME VARCHAR(1000) NOT NULL ");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

    public static String createSala(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS SALA( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("POLTRONAS INTEGER NOT NULL, ");
        sqlBuilder.append("NUM_SALA INTEGER NOT NULL,");
        sqlBuilder.append("TIPO VARCHAR(200), ");;
        sqlBuilder.append("ID_SESSAO INTEGER NOT NULL,");
        sqlBuilder.append("FOREIGN KEY(ID_SESSAO) REFERENCES SESSAO(ID_SESSAO)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

    public static String createSessao(){

        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE IF NOT EXISTS SALA( ");
        sqlBuilder.append("_id INTEGER NOT NULL ");
        sqlBuilder.append("PRIMARY KEY AUTOINCREMENT,");
        sqlBuilder.append("DATAHORA DATETIME NOT NULL, ");
        sqlBuilder.append("PRECO REAL NOT NULL, ");
        sqlBuilder.append("ID_FILME INTEGER NOT NULL, ");
        sqlBuilder.append("FOREIGN KEY(ID_FILME) REFERENCES FILME(ID_FILME)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }

}
