package structure;

public abstract class Etudiant {
	
	private String nom;
	public Etudiant(String name) {
		this.nom = name;
	}
	public String getName() { 
		return this.nom;
	
	}
}