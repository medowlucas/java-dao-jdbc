package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) throws ParseException {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===Test 1: seller findById===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("===Test 2: seller findByDepartment===");
        Department department = new Department(2,null);
        List<Seller> sellers = sellerDao.findByDepartment(department);
        for(Seller obj : sellers){
            System.out.println(obj);
        }

        System.out.println("===Test 3: seller findAll===");
        sellers = sellerDao.findAll();
        for(Seller obj : sellers){
            System.out.println(obj);
        }

        System.out.println("===Test 4: seller insert===");
        Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0, new Department(1,"Computers"));
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = "+ newSeller.getId());

    }
}
