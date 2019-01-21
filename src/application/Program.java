package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {
	
	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(2);
		
		System.out.println("=== Department : findById");
		System.out.println(department);
		
		System.out.println("=== Department : findAll");
		for(Department obj : departmentDao.findAll()) {
			System.out.println(obj);
		}
		
		System.out.println("=== Department : Insert");
		Department dep = new Department(null, "Coffe");
		departmentDao.insert(dep);
	}
}
