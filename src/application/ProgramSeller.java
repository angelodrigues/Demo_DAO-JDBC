package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.Department;
import model.Seller;
import model.dao.DaoFactory;
import model.dao.SellerDao;

public class ProgramSeller {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);

        System.out.println("\n=== TESTE 2: Seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TESTE 3: Seller findAll ===");        
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n=== TESTE 4: Seller insert ===");        
        Seller newSeller = new Seller(null, "Yasmim", "yasmim@gmail.com", new Date(), 5000.0, department);

        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n=== TESTE 5: Seller update ===");    
        seller = sellerDao.findById(7);
        seller.setBaseSalary(10000.0);
        sellerDao.update(seller);
        System.out.println("Update completed");

        System.out.println("\n=== TESTE 6: Seller delete ===");   
        System.out.println("Enter id for delete test: "); 
        Integer id = sc.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");
        sc.close();
    }
}
