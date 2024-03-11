package br.DevSuperior.application;

import br.DevSuperior.model.dao.DaoFactory;
import br.DevSuperior.model.dao.SellerDao;
import br.DevSuperior.model.entities.Department;
import br.DevSuperior.model.entities.Seller;

import java.util.List;


public class Main_findById {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" *****  TEST 1: seller findById  ***** ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n*****  TEST 2: seller findByDepartment  ***** ");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for(Seller obj : list) {
            System.out.println(obj);
        }
    }
}