package com.takata.trabalhodecrud.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Suplier {
    @PrimaryKey()
    public int ID;

    @ColumnInfo()
    public int doc;

    @ColumnInfo()
    public String nome;

    @ColumnInfo()
    public String email;

    @ColumnInfo()
    public String telefone;
}
