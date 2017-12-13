package entreprise;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public abstract class Service {
	private String nom = null;
	
	public Service () {		
	}
	public Service (String nom) {
		this();
		this.nom = nom;
	}
	public abstract String getType();
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom ;
	}	
}
