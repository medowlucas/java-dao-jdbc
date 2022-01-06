package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===Test 1: department findById===");
        Department department = departmentDao.findById(3);
        System.out.println(department);

        System.out.println("===Test 2: department insert===");
        department = new Department(null,"Frutas");
        departmentDao.insert(department);
        System.out.println("Inserted! New id = "+ department.getId());

        System.out.println("===Test 3: department update===");
        department = departmentDao.findById(6);
        department.setName("Fruta Podre");
        departmentDao.update(department);
        System.out.println("Update Completed");

        System.out.println("===Test 4: department findByName===");
        String nome = "Fruta";
        List<Department> departments = departmentDao.findByName(nome);
        for(Department obj : departments){
            System.out.println(obj);
        }

        System.out.println("===Test 5: department findAll===");
        departments = departmentDao.findAll();
        for(Department obj : departments){
            System.out.println(obj);
        }

        System.out.println("===Test 6: department delete===");
        System.out.print("Digite um Id para deletar na tabela department: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete Completed!");
        sc.close();
    }
}
