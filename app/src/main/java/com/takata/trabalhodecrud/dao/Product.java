package com.takata.trabalhodecrud.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public class Product {
    @Dao
    public interface UserDao {
        @Query("SELECT * FROM product")
        List<Product> getAll();

        @Query("SELECT * FROM product WHERE ID IN (:userIds)")
        List<Product> loadAllByIds(int[] userIds);

        @Insert
        void insertAll(Product... users);

        @Delete
        void delete(Product user);
    }
}