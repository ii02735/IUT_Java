package personnel;

public class Technique extends Personnel{

	public Technique(String matricule, String nom) {
		super(matricule, nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTypePersonnel() {
		// TODO Auto-generated method stub
		return "Technique";
	}

}
