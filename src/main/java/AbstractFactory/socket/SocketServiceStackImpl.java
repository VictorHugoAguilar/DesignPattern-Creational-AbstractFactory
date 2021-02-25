package AbstractFactory.socket;

import AbstractFactory.impl.IServiceStackAbstractFactory;
import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductsService;

public class SocketServiceStackImpl implements  IServiceStackAbstractFactory  {

	@Override
	public IEmployeeService getEmployeeService() {
		return new EmployeeServiceSocketImpl();
	}

	@Override
	public IProductsService getProductsService() {
		return new ProductoServiceSocketImpl();
	}

}
