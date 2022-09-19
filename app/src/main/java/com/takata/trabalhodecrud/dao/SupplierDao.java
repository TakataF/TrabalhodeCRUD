package com.takata.trabalhodecrud.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.takata.trabalhodecrud.entities.Supplier;

import java.util.List;

@Dao
public interface SupplierDao {
    @Query("SELECT * FROM supplier")
    List<Supplier> getAll();

    @Query("SELECT * FROM supplier WHERE ID IN (:userIds)")
    List<Supplier> loadAllByIds(int[] userIds);

    @Insert
    void insertAll(Supplier... users);

    @Delete
    void delete(Supplier user);
}
