package AbstractFactory;

import java.util.Arrays;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.impl.ServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductsService;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
		
		IEmployeeService employeeService = factory.getEmployeeService();
		IProductsService productsService = factory.getProductsService();
		
		System.out.println("EmployeeSercice class ->" + employeeService.getClass().getCanonicalName());
		System.out.println("ProductsService class -> " + productsService.getClass().getCanonicalName());
		
		System.out.println("getEmployee -> " + Arrays.toString(employeeService.getEmployee()));
		System.out.println("getProducts -> " + Arrays.toString(productsService.getProducts()));
	}
}
