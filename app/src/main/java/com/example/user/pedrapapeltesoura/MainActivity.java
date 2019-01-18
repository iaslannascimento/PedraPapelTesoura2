package com.example.user.pedrapapeltesoura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarPapel(View view){
        this.escolha(1);
    }

    public void selecionarPedra(View view){
        this.escolha(2);
    }

    public void selecionarTesoura(View view){
        this.escolha(3);
    }

    public void escolha(View view){

    }
}
