package com.takata.trabalhodecrud.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.takata.trabalhodecrud.entities.Product;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * FROM product")
    List<Product> getAll();

    @Query("SELECT * FROM product WHERE ID IN (:productIds)")
    List<Product> loadAllByIds(int[] productIds);

    @Insert
    void insertAll(Product... products);

    @Delete
    void delete(Product product);
}
