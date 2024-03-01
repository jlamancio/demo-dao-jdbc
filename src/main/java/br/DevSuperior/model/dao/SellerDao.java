package br.DevSuperior.model.dao;


import br.DevSuperior.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert (Seller obj);
    void updaate(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findAll();
}
