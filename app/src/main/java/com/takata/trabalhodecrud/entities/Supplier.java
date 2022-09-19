package com.takata.trabalhodecrud.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Supplier {
    @PrimaryKey()
    public int ID;

    @ColumnInfo()
    public String cpfCnpj;

    @ColumnInfo()
    public String nome;

    @ColumnInfo()
    public String email;

    @ColumnInfo()
    public String telefone;
}
