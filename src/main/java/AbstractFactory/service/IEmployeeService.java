package AbstractFactory.service;

/**
 * Esta inteface tambien representa un servicio del sistema BackEnd en este caso
 * el servicio nos servirá para consumir los productos del sistema BackEnd.
 * 
 * Esta Interfacae también tendrá que ser implementado dos veces una para
 * consumir el servicio por Rest u otro por WebService
 * 
 * @author Victor Hugo Aguilar Aguilar
 *
 */
public interface IEmployeeService {

	public String[] getEmployee();
}
