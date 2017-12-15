package serveur;

import java.io.IOException;

public class ServeurReservation extends Serveur{
	
	private final static int PORT = 2500;
	
	public ServeurReservation() {
		super(PORT);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setServeurName() {
		// TODO Auto-generated method stub
		super.nomServeur = "Réservation";
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true)
				new ServiceReservation(super().getSocket()).lancer();
		}
		catch(IOException e){
			System.err.println("Erreur lors du lancement du service");
		}
		
	}



}
