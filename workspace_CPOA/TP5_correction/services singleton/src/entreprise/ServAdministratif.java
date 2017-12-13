package entreprise;

public final class ServAdministratif extends Service {
	private static Service _instance = new ServAdministratif("Service Administratif");
	
	public static Service getInstance() { return _instance; }

	private ServAdministratif(String nom) {
		super(nom);		
	}
	
	@Override
	public String getType() {		
		return "Administratif";
	}	
}
