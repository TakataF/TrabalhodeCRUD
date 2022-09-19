package com.takata.trabalhodecrud;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.util.Log;

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
    }
}