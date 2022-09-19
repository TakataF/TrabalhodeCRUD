package com.takata.trabalhodecrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.takata.trabalhodecrud.databases.AppDatabase;
import com.takata.trabalhodecrud.entities.Product;

import java.util.List;

public class TelaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        Button fornecedorBtn = findViewById(R.id.button1);
        Intent intent = new Intent(this, ListarFornecedor.class);
        fornecedorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}