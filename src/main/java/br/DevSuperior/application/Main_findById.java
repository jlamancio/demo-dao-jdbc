package br.DevSuperior.application;

import br.DevSuperior.model.dao.DaoFactory;
import br.DevSuperior.model.dao.SellerDao;
import br.DevSuperior.model.entities.Department;
import br.DevSuperior.model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Main_findById {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(" *****  TEST 1: seller findById  ***** ");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n*****  TEST 2: seller findByDepartment  ***** ");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n*****  TEST 3: seller findAll  ***** ");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n*****  TEST 4: seller Insert  ***** ");
        Seller newSeller = new Seller(null, "Greg", "greg@email.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n*****  TEST 5: seller Update  ***** ");
        seller = sellerDao.findById(1);
        seller.setName("Maria Maria Maria");
        sellerDao.update(seller);
        System.out.println("Update Completed");

    }

}

