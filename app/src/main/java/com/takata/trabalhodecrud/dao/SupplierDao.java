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

    @Query("SELECT * FROM supplier WHERE ID IN (:supplierIds)")
    List<Supplier> loadAllByIds(int[] supplierIds);

    @Insert
    void insertAll(Supplier... suppliers);

    @Delete
    void delete(Supplier supplier);
}
