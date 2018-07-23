package com.example.bruna.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {
private ImageView imagem;
private ImageView botaoVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        imagem = (ImageView) findViewById(R.id.moedaId);
        botaoVoltar = (ImageView) findViewById(R.id.botaovoltarId);

        Bundle extra = getIntent().getExtras();

        if (extra !=null){
            String opcaoescolhida = extra.getString("opcao");
            if (opcaoescolhida.equals("cara")){
                //imagem cara
                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_cara));
            }else {
                //imagem coroa

                imagem.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.moeda_coroa));
            }
        }


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }
}
