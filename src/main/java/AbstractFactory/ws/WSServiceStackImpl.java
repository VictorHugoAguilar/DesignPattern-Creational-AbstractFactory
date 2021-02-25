package AbstractFactory.ws;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductsService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceWSImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductServiceWSImpl();
	}

	
	
}
