package com.takata.trabalhodecrud.databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.takata.trabalhodecrud.entities.Product;
import com.takata.trabalhodecrud.entities.Supplier;

@Database(entities = {Product.class, Supplier.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract com.takata.trabalhodecrud.dao.Product.ProductDao productDao();
    public abstract com.takata.trabalhodecrud.dao.Supplier.SupplierDao supplierDao();
}
