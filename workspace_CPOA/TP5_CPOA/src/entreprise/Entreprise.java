package entreprise;

import java.util.ArrayList;
import java.util.List;

import Factory.IService;
import Factory.IServiceFactory;
import Factory.ServAdministratif;
import Factory.ServTechnique;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class Entreprise {
	List<IService> _Services = new ArrayList<IService>();
	private IServiceFactory factory;
	public Entreprise(IServiceFactory factory)
	{
		this.factory = factory;
	}
	
	// Ajout d'un service
	public void addService (String nom, String type) throws IllegalArgumentException, ServiceExistantException {
//		IServiceFactory service;
//		if (type.equals("Administratif")) 
//			service = ServAdministratif.getInstance(nom);
//		else if (type.equals("Technique"))
//			service = new ServTechnique(nom);
//		else
//			throw new IllegalArgumentException ("type");
		if (this.searchServiceByNom(nom) != null)
			throw new ServiceExistantException (nom);
		this._Services.add(service);		
	}
	
	// Recherche de services par nom (clé de gestion)
	public IService searchServiceByNom (String nom){		
		for (IService service : _Services)
			if (service.getNom().equals(nom))
				return service;
		return null;
	}	
}
