package com.takata.trabalhodecrud.databases;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.takata.trabalhodecrud.dao.ProductDao;
import com.takata.trabalhodecrud.dao.SupplierDao;
import com.takata.trabalhodecrud.entities.Product;
import com.takata.trabalhodecrud.entities.Supplier;

@Database(entities = {Product.class, Supplier.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ProductDao productDao();
    public abstract SupplierDao supplierDao();
}
