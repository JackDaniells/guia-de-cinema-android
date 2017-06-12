package com.guiacinemamaneiro.guia_cinema.Controller.Usuario;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.guiacinemamaneiro.guia_cinema.Controller.Cinema.ListaCinemasActivity;
import com.guiacinemamaneiro.guia_cinema.Model.Entities.Usuario;
import com.guiacinemamaneiro.guia_cinema.R;

public class LoginUsuarioActivity extends AppCompatActivity {

    public static Usuario usuarioLogado = null;
    private Button btnLogin;
    private EditText login, senha;
    private TextView cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_usuario);

        cadastrar = (TextView)findViewById(R.id.textViewCadastrar);
        btnLogin = (Button)findViewById(R.id.buttonLogin);
        login = (EditText)findViewById(R.id.editTextLogin);
        senha = (EditText)findViewById(R.id.editTextSenha);


        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginUsuarioActivity.this, CadastroUsuarioActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = null;
                usuarioLogado = buscaUsuario(login.getText().toString(), senha.getText().toString());
                if(usuarioLogado!= null){
                    startActivity(new Intent(LoginUsuarioActivity.this, ListaCinemasActivity.class));
                }else {

                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginUsuarioActivity.this);
                    dialog.setMessage("Erro ao efetuar login");
                    dialog.setPositiveButton("OK", null);
                    dialog.show();
                }
            }
        });

    }

    private Usuario buscaUsuario(String usuario, String senha){
        //TODO: fazer metodo busca usuario
        return null;
    }
}

