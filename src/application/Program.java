package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

import java.text.ParseException;

public class Program {

    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===Test 1: seller findById===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
