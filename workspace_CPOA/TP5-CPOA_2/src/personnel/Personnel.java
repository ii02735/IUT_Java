package personnel;

public abstract class Personnel implements IPersonnel {
	private String matricule, nom;
	
	public Personnel(String matricule, String nom)
	{
		this.matricule = matricule;
		this.nom = nom;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public abstract String getTypePersonnel();

	@Override
	public String getMatricule() {
		// TODO Auto-generated method stub
		return this.matricule;
	}
	
}
