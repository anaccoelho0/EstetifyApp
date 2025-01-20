package com.example.estetifyapp;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvEstetify, tvSobrancelha;
    private Button locationButton;
    private GridLayout gridLayout;
    private ImageButton sobRancelhaButton, maquiagemButton, depilacaoButton, massagemButton;
    private ImageButton salaButton, barbeiraButton, unhasButton, autocuidadoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        // Inicializando os componentes da interface
        tvEstetify = findViewById(R.id.tv_estetify);
        tvSobrancelha = findViewById(R.id.tv_sobrancelha);
        locationButton = findViewById(R.id.locationButton);
        gridLayout = findViewById(R.id.gridLayout);

        // Inicializando ImageButtons (no grid)
        sobRancelhaButton = findViewById(R.id.ib_sobrancelha);
        maquiagemButton = findViewById(R.id.ib_maquiagem);
        depilacaoButton = findViewById(R.id.ib_depilacao);
        massagemButton = findViewById(R.id.ib_massagem);
        salaButton = findViewById(R.id.ib_salao);
        barbeiraButton = findViewById(R.id.ib_barbearia);
        unhasButton = findViewById(R.id.ib_unhas);
        autocuidadoButton = findViewById(R.id.ib_autocuidado);

        // Definindo um comportamento para o botão de localização
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicione aqui a lógica de interação quando o botão for clicado
                // Pode abrir uma tela de seleção de local, por exemplo
            }
        });

        // Configurando eventos de clique para os botões de imagem no GridLayout
        sobRancelhaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicionar funcionalidade específica para este botão
                // Exemplo: exibir uma nova tela ou alterar algum elemento da UI
            }
        });

        maquiagemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para o botão de maquiagem
            }
        });

        // Similar para os outros ImageButtons
        depilacaoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para o botão de depilação
            }
        });

        massagemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lógica para o botão de massagem
            }
        });

        // Continue configurando os outros botões da mesma forma...

    }
}