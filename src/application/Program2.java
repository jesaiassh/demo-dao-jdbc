package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("Insert");
		
		Department newDepartment = new Department(null,"Novos Funcionários");
		department.insert(newDepartment);
		System.out.println("Novo departamento inserido: "+newDepartment.getId());
		
		
	}

}
