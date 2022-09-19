package com.takata.trabalhodecrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.takata.trabalhodecrud.databases.AppDatabase;
import com.takata.trabalhodecrud.entities.Supplier;

import java.util.List;

public class TelaCadastroFornecedor extends AppCompatActivity {
    protected String doc;
    protected String nome;
    protected String email;
    protected String telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText docField = findViewById(R.id.cnpj);
        EditText nomeField = findViewById(R.id.nome_fornecedor);
        EditText emailField = findViewById(R.id.email_fornecedor);
        EditText telefoneField = findViewById(R.id.telefone_forncedor);
        setContentView(R.layout.activity_tela_cadastro_fornecedor);
        Button btn = findViewById(R.id.enviar_fornecedor_add);
        Intent intent = new Intent(this, ListarFornecedor.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doc = docField.getText().toString();
                nome = nomeField.getText().toString();
                email = emailField.getText().toString();
                telefone = telefoneField.getText().toString();
                Supplier supplier = new Supplier();
                supplier.cpfCnpj = doc;
                supplier.email = email;
                supplier.telefone = telefone;
                supplier.nome = nome;
                Thread newThread = new Thread(() -> {
                    AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                            AppDatabase.class, "pelegron").build();
                    db.supplierDao().insertAll(supplier);
                    startActivity(intent);
                });
            }
        });
    }
}