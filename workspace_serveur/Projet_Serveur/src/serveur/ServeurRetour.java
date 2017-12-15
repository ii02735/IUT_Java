package serveur;

public class ServeurRetour extends Serveur{
	
	private final static int PORT = 2700;
	
	public ServeurRetour() {
		super(PORT);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setServeurName() {
		// TODO Auto-generated method stub
		super.nomServeur = "Retour";
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
