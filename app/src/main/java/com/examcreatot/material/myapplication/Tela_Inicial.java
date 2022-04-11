package com.examcreatot.material.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Tela_Inicial extends AppCompatActivity {

    ImageView addcliente;
    ImageView novoorcamento;
    ImageView bsc_cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);


        // Botão Adicionar //

        addcliente = findViewById(R.id.addcliente);

        addcliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tela_Inicial.this, Tela_Cadastro.class));
            }
        });


        // Botão Adicionar Orçamento //

        novoorcamento = findViewById(R.id.addorcamento);

        novoorcamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tela_Inicial.this, Tela_Produtos.class));
            }
        });


        // Botão Buscar Orçamento //

        bsc_cliente = findViewById(R.id.buscarorcamento);

        bsc_cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Tela_Inicial.this, Tela_Buscar_Orcamento.class));
            }
        });


    }
}