package AbstractFactory.impl;

import AbstractFactory.service.IEmployeeService;
import AbstractFactory.service.IProductsService;

/**
 * Interface que define la estrucutra del ConcreteAbstractFactory en ella se
 * debe definir un metodo por cdad clase que conforma la familia. En este en
 * concreto tenemos dos servicios uno que consulta los empleado y el otro que
 * consulta los producto por elllo estas interface tienen dos métodos.
 * 
 * Estos métodos regresan interfaces y no definen clases en concreto ya que esta
 * interface debera ser implementada por cada familia de las clases y estas
 * regresaran la clases concretas.
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IServiceStackAbstractFactory {

	public IEmployeeService getEmployeeService();

	public IProductsService getProductsService();
}
