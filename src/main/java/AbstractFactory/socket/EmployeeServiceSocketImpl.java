package AbstractFactory.socket;

import AbstractFactory.service.IEmployeeService;

public class EmployeeServiceSocketImpl implements IEmployeeService {

	private static final String[] EMPLOYEES = new String[] { "Juan", "Victor", "Paula" };

	@Override
	public String[] getEmployee() {
		System.out.println("Socket");
		return EMPLOYEES;
	}

}
