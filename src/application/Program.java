package application;

import java.util.Date;

import model.Department;
import model.Seller;

public class Program {
    public static void main(String[] args) throws Exception {

        Department obj = new Department(1, "Books");
        System.out.println(obj);

        Seller seller = new Seller(21, "Angelo", "angelo@gmail.com", new Date(), 2000.0, obj);
        System.out.println(seller);
    }
}
