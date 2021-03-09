package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		 
		 //busca por id
		System.out.println("Insert");
		System.out.println("department findById");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		
		//buscar todos departamento
		System.out.println("Implementation FindAll");
		List<Department>list = departmentDao.findAll();
		for(Department d :list) {
			System.out.println(d);
		}
		
		//inserindo novo department
		Department newDepartment = new Department(null,"Novos Funcionários");
		departmentDao.insert(newDepartment);
		System.out.println("Novo departamento inserido: "+newDepartment.getId());
	
		
		//atualizando department
		System.out.println("Update: ");
		Department dep2 = departmentDao.findById(1);
		dep2.setName("Smartphones");
		departmentDao.update(dep2);
		System.out.println("Update completed");
		
		//deletando department
		System.out.println("\n=== TEST 5: delete =======");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

	}

}
