package Factory;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class ServAdministratif extends Service {
	
	private static ServAdministratif _Instance = new ServAdministratif("service administratif");
	private ServAdministratif(String nom) {
		super(nom);		
	}
	
	public static ServAdministratif getInstance(String nom)
	{
		return _Instance;
	}
	
	@Override
	public String getType() {		
		return "Administratif";
	}	
}
