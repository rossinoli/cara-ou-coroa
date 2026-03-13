package com.example.caraoucora;

import android.os.Bundle; // B maiúsculo para evitar erro
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class jogo extends AppCompatActivity {

    private ImageView imageResultado;
    private Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        // Ligando os componentes do XML com o Java
        imageResultado = findViewById(R.id.imageResultado);
        voltar = findViewById(R.id.voltar);

        // Recebe o número (0 ou 1) que a primeira tela sorteou
        Bundle dados = getIntent().getExtras();

        if (dados != null) {
            int numero = dados.getInt("numero");

            if (numero == 0) {
                // Se for 0, coloca a imagem cara.png
                imageResultado.setImageResource(R.drawable.cara);
            } else {
                // Se for 1, coloca a imagem coroa.png
                imageResultado.setImageResource(R.drawable.coroa);
            }
        }

        // Faz o botão voltar fechar essa tela
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}