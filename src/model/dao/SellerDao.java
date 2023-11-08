package model.dao;

import java.util.List;

import model.Seller;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller obj);
    Seller findById(Seller id);
    List<Seller> findAll();   
}