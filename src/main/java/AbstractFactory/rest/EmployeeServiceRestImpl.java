package AbstractFactory.rest;

import AbstractFactory.service.IEmployeeService;

public class EmployeeServiceRestImpl implements IEmployeeService {

	private static final String[] EMPLOYEES = new String[] {"Juan", "Victor", "Paula"};
	
	@Override
	public String[] getEmployee() {
		System.out.println("RestFull");
		return EMPLOYEES;
	}
	
}
