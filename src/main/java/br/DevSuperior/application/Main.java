package br.DevSuperior.application;

import br.DevSuperior.model.dao.DaoFactory;
import br.DevSuperior.model.dao.SellerDao;
import br.DevSuperior.model.entities.Department;
import br.DevSuperior.model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department department = new Department(1, "Books");

        Seller seller = new Seller(21, "José Luis Amancio", "amancio@email.com",
                new Date(), 3000.00, department);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(department);
        System.out.println(seller);

    }
}