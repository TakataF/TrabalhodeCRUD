package com.takata.trabalhodecrud.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Product {
    @PrimaryKey
    public int ID;

    @ColumnInfo()
    public String name;

    @ColumnInfo()
    public int quantidade;

    @ColumnInfo()
    public double valor;

}
