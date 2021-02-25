package AbstractFactory.service;

/**
 * Esta interface define el primer servicio y es utilizado para consultar el
 * listado de productos, deberá ser implementado dos veces una prara consumir el
 * servicio por WebService y otro por restFull
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IProductsService {

	public String[] getProducts();

}
