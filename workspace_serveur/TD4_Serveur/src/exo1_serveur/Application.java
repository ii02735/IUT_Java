package exo1_serveur;

public class Application {

	private final static int PORT = 1234;
	
	public static void main(String[] args) {
		
		//Proc�der au lancement de la socket
			new Thread(new Serveur(PORT)).start();

	}

}
