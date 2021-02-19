package application;



import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao selleDao = DaoFactory.createSellerDao(); 
		System.out.println(" === Teste 01 Seller: findBay id.");
		Seller seller = selleDao.findById(3);
		System.out.println(seller);
		
		System.out.println(" \n === Teste 02 Seller: findBay Departament.");
		Department department = new Department(2,null);
		List<Seller>list = selleDao.findBayDepartment(department);
		for(Seller obj:list) {
			System.out.println(obj);
			
			
			System.out.println(" \n === Teste 03 Seller: Insert.");
			
			Seller newSeller = new Seller(null,"Miguel","mig@gmail.com",new Date(),3000.0,department);
			selleDao.insert(newSeller);
			System.out.println(" Inserted ! new id "+ newSeller.getId());

		}

	}

	
}
