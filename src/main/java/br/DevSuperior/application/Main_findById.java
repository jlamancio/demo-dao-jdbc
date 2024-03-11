package br.DevSuperior.application;

import br.DevSuperior.model.dao.DaoFactory;
import br.DevSuperior.model.dao.SellerDao;
import br.DevSuperior.model.entities.Seller;


public class Main_findById {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(" *****  TEST 1: seller findById  ***** ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}