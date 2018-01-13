package serveur;

import java.io.IOException;


public class ServeurFactory implements IServeurFactory{
	
	@Override
	public Serveur creerServeur(String nom) throws IOException {
		// TODO Auto-generated method stub
		switch(nom)
		{
			case "Emprunt":
				return new ServeurEmprunt();
			case "Reservation":
				return new ServeurReservation();
			case "Retour":
				return new ServeurRetour();
			default:
				throw new IOException("Unknown server");
		}
	}

}
