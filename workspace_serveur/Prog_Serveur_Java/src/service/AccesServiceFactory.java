package service;

import serveur.PORT;
import client.IAccesServicesFactory;
import client.InputOutput;
import exceptions.AccesException;

public class AccesServiceFactory implements IAccesServicesFactory{
	
	@Override
	public InputOutput creerAcces(String nomService) throws AccesException {
		// TODO Auto-generated method stub
		if(nomService.compareTo("Emprunt")==0)
			return new InputOutput("127.0.1.1",PORT.EMPRUNT);
		else if(nomService.compareTo("Reservation")==0)
			return new InputOutput("127.0.1.1", PORT.RESERVATION);
		else if(nomService.compareTo("Retour")==0)
			return new InputOutput("127.0.1.1",PORT.RETOUR);
		throw new AccesException();
	}


}
