package AbstractFactory.rest;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductsService;

public class RestServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceRestImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductoServiceRestImpl();
	}

}
