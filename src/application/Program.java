package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {
	
	public static void main(String[] args) {
		DepartmentDao model = DaoFactory.createDepartmentDao();
		Department department = model.findById(2);
		
		System.out.println("=== Department : findById");
		System.out.println(department);
		
		System.out.println("=== Department : findAll");
		for(Department obj : model.findAll()) {
			System.out.println(obj);
		}
		
		System.out.println("=== Department : Insert");
		department = new Department(null, "Coffe");
		model.insert(department);
		
		System.out.println("=== Department : Update");
		department = model.findById(8);		
		department.setName("Orange");
		model.update(department);
		
		System.out.println("=== Department : Delete");
		model.deleteById(8);
	}
}
