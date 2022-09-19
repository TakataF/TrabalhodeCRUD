package com.takata.trabalhodecrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.takata.trabalhodecrud.databases.AppDatabase;
import com.takata.trabalhodecrud.entities.Supplier;

import java.util.List;

public class ListarFornecedor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Thread newThread = new Thread(() -> {
            AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                    AppDatabase.class, "pelegron").build();
            List<Supplier> teste = db.supplierDao().getAll();
            Log.i("DB", teste.toString());
            teste.forEach(item -> Log.i("DB", item.nome));
        });
        newThread.start();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_fornecedor);
        Intent intent = new Intent(this, TelaCadastroFornecedor.class);
        Button btn = findViewById(R.id.adicionar_novo_fornecedor);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}