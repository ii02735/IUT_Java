package serveur;

import java.io.IOException;



import bibliotheque.Bibliotheque;
import bibliotheque.Livre;

public class Application {
	
	public static void main(String[]args)
	{
		Bibliotheque.ajouterAbonne(20);
		Bibliotheque.ajouterAbonne(21);
		Bibliotheque.ajouterAbonne(22);
		Bibliotheque.ajouterDocuments(new Livre(1));
		Bibliotheque.ajouterDocuments(new Livre(2));
		Bibliotheque.ajouterDocuments(new Livre(3));
		Bibliotheque.ajouterDocuments(new Livre(4));
		Bibliotheque.ajouterDocuments(new Livre(5));
		try {
			new Thread(new ServeurEmprunt()).start();
			new Thread(new ServeurReservation()).start();
			new Thread(new ServeurRetour()).start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
