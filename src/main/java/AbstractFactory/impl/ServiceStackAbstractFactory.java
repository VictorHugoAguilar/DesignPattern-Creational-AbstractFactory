package AbstractFactory.impl;

import java.util.Properties;

import AbstractFactory.util.PropertiesUtil;

public class ServiceStackAbstractFactory {

		public ServiceStackAbstractFactory() {
		}
		
		public static IServiceStackAbstractFactory createServiceFactory() {
			Properties props = PropertiesUtil.load("META-INF/AbstractFactoryConfiguration.properties");
			String factoyClass = props.getProperty("serviceProductImplClass");
			try {
				return (IServiceStackAbstractFactory) Class.forName(factoyClass).newInstance();
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		
}
 