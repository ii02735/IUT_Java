package personnel;

public class Administratif extends Personnel{

	public Administratif(String matricule, String nom) {
		super(matricule, nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTypePersonnel() {
		// TODO Auto-generated method stub
		return "Administratif";
	}

}
