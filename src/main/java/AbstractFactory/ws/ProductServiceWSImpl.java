package AbstractFactory.ws;

import AbstractFactory.service.IProductsService;

/**
 * Clase perteneciente a la familia de WebService simula invocar a un WebService
 * para consultar la lista de productos la lcase implementa IProductoServicepor
 * que debe implementar el método getProducts
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class ProductServiceWSImpl implements IProductsService {

	private static final String[] PRODUCTS = new String[] { "Teclado", "Ratón", "Monitor" };

	@Override
	public String[] getProducts() {
		System.out.println("WebService");
		return PRODUCTS;
	}

}
