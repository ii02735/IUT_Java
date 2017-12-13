package services;

import entreprise.IService;

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
	public Personnel creerPersonnel(String matricule, String nom) {
		return new PersonnelAdministratif(matricule, nom);
	}
}
