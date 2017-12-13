package services;

import entreprise.IService;
import personnel.Administratif;
import personnel.Personnel;

public class ServAdministratif extends Service {
	private static String type = "Administratif";
	private static ServAdministratif _instance = new ServAdministratif("Service Administratif");

	protected ServAdministratif(String nom) {
		super(nom);
	}
	
	@Override
	public String getType() {		
		return type;
	}

	public static Service getInstance() {
		return _instance;
	}

	@Override
	public IService spawn(String nom) {
		return getInstance();
	}

	@Override
	public Personnel embaucherPersonnel(String matricule,String nom) {
		// TODO Auto-generated method stub
		return new Administratif(matricule, nom);
		
	}	
}
