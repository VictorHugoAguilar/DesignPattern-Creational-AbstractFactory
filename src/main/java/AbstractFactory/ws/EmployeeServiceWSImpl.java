package AbstractFactory.ws;

import AbstractFactory.service.IEmployeeService;

/**
 * Esta clase pertenece a la familia de WebService la cual simula la consutla
 * empleado la clase implementa la interface IEmployeeService y define el método
 * getEmployee
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class EmployeeServiceWSImpl implements IEmployeeService {
	private static final String[] EMPLOYEES = new String[] { "Juan", "Victor", "Paula" };

	@Override
	public String[] getEmployee() {
		System.out.println("WebService");
		return EMPLOYEES;
	}

}
