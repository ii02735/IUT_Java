package client;

import exceptions.AccesException;


public interface IAccesServicesFactory {
	
	InputOutput creerAcces(String nomService) throws AccesException;
}
