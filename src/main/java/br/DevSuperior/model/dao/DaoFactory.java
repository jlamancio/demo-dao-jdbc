package br.DevSuperior.model.dao;

import br.DevSuperior.db.DB;
import br.DevSuperior.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }
}
