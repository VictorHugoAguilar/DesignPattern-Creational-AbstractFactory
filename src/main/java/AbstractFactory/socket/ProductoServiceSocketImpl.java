package AbstractFactory.socket;

import AbstractFactory.service.IProductsService;

public class ProductoServiceSocketImpl implements IProductsService{

	private static final String[] PRODUCTS = new String[] { "Teclado", "Ratón", "Monitor" };

	
	@Override
	public String[] getProducts() {
		System.out.println("Socket");
		return PRODUCTS;
	}

}
