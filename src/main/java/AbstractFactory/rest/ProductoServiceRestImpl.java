package AbstractFactory.rest;

import AbstractFactory.service.IProductsService;

/**
 * Esta clase es la primera implementación del servicio de consulta de productos
 * la clase hereda de IProductoService e implementa el método getProducts.
 * 
 * Con ello simulamos que invocamos a un RestFull y que nos regresa la lista de
 * productos
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public class ProductoServiceRestImpl implements IProductsService {

	private static final String[] PRODUCTS = new String[] { "Teclado", "Ratón", "Monitor" };

	@Override
	public String[] getProducts() {
		System.out.println("RestFull");
		return PRODUCTS;
	}

}
