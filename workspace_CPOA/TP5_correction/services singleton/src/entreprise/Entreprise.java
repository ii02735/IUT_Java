package entreprise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class Entreprise {
	List<Service> _Services = new ArrayList<Service>();
	
	// Ajout d'un service
	public void addService (String nom, String type) throws IllegalArgumentException, ServiceExistantException {
		Service service = null;
		if (type.equals("Administratif")) {
			service = ServAdministratif.getInstance();
			if (! nom.equals(service.getNom()))
				throw new IllegalArgumentException("le nom du service administratif doit etre "
						+service.getNom());
			}
		else if (type.equals("Technique"))
			service = new ServTechnique(nom);
		else
			throw new IllegalArgumentException ("type");
		if (this.searchServiceByNom(nom) != null)
			throw new ServiceExistantException (nom);
		this._Services.add(service);		
	}
	
	// Recherche de services par nom (clé de gestion)
	public Service searchServiceByNom (String nom){		
		for (Service service : _Services)
			if (service.getNom().equals(nom))
				return service;
		return null;
	}	
}
