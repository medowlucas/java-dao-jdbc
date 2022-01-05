package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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

//        System.out.println("===Test 4: seller insert===");
//        Seller newSeller = new Seller(null,"Greg","greg@gmail.com",new Date(),4000.0, new Department(1,"Computers"));
//        sellerDao.insert(newSeller);
//        System.out.println("Inserted! New id = "+ newSeller.getId());

        System.out.println("===Test 5: seller update===");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        seller.setEmail("marta@waine.com");
        sellerDao.update(seller);
        System.out.println("Update Completed");

        System.out.println("===Test 6: seller delete===");
        System.out.print("Digite um Id para deletar na tabela seller: ");
        int id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();
    }
}
