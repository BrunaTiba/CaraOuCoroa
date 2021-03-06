package com.example.bruna.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String [] opcao = {"cara", "coroa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Gerar numero aleatorio
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(2);
                //opcao[numeroAleatorio]
                  Intent intent = new Intent(getApplicationContext(), DetalheActivity.class);
                  intent.putExtra("opcao", opcao[numeroAleatorio]);
                  startActivity(intent);
            }
        });



    }
}
