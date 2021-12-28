package application;

import model.entities.Department;
import model.entities.Seller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

    public static void main(String[] args) throws ParseException {
        Department department = new Department(1,"Books");
        System.out.println((department));

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf.parse("24/03/1990");


        Seller seller = new Seller(21,"Lucas","medowlucas@gmail.com",birthDate,3000.0,department);
        System.out.println((seller));
    }
}
