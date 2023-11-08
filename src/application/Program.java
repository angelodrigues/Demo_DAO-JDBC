package application;

import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {
    public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}
