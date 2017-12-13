package entreprise;

import java.util.ArrayList;
import java.util.List;



public class Entreprise {
	private List<IService> _Services = new ArrayList<>();
	private IServiceFactory factory;
	
	public Entreprise(IServiceFactory factory) {
		this.factory = factory;
	}	
	
	public void addService (String nom, String type) 
			throws IllegalArgumentException, ServiceExistantException {
		IService service = null;
		if (this.searchServiceByNom(nom) != null)
			throw new ServiceExistantException (nom);
		service = factory.create(type, nom);
		this._Services.add(service);		
	}

	
	// Recherche de services par nom (cle de gestion)
	public IService searchServiceByNom (String nom){		
		for (IService service : _Services)
			if (service.getNom().equals(nom))
				return service;
		return null;
	}
	
	public void embaucher( String matricule, String nom, String nomService)
            throws IllegalArgumentException {
        IService service = searchServiceByNom(nomService);
        if (service == null)
            throw new IllegalArgumentException ("service inconnu :" + nomService);
        service.embaucher(matricule, nom);
    }

}
