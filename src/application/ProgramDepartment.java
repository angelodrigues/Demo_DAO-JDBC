package application;

import java.util.List;
import java.util.Scanner;

import model.Department;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;

public class ProgramDepartment {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
//------------------------------------------------------------------------------------------------
        System.out.println("=== TESTE 1: Department findById ===");
        Department department = departmentDao.findById(1);

        System.out.println(department);
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== TESTE 2: Department insert ===");        
        Department newDepartment = new Department(null,"Candy Shop");

        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== TESTE 3: Department update ===");    
        department = departmentDao.findById(7);
        department.setName("Buceta");
        departmentDao.update(department);
        System.out.println("Update completed");
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== TESTE 4: Department delete ===");   
        System.out.println("Enter id for delete test: "); 
        Integer id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");
//------------------------------------------------------------------------------------------------
        System.out.println("\n=== TESTE 5: Department findAll ===");        
        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }
       sc.close();
    }
}
