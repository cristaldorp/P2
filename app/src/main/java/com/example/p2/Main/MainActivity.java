package com.example.p2.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.p2.R;
import com.example.p2.dao.bd;

public class MainActivity extends AppCompatActivity {

    private ListView Listagem_Cidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listagem_Cidade = findViewById(R.id.lista_cidade);

    }

    public void novaCidade(View view){
        Intent it = new Intent(MainActivity.this, CadastroCidade.class);
        startActivityForResult(it, 121);
    }
    public void Atualiza(){
        ArrayAdapter listar =new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, bd.getDados());
        Listagem_Cidade.setAdapter(listar);
    }
}