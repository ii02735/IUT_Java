package serveur;

public class ServeurEmprunt extends Serveur{
		
	private final static int PORT = 2600;
	
	public ServeurEmprunt() {
		super(PORT);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setServeurName() {
		// TODO Auto-generated method stub
		super.nomServeur = "Emprunt";
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}



}
