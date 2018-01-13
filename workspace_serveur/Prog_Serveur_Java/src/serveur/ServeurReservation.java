package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import service.ServiceReservation;



public class ServeurReservation implements Runnable{

	private ServerSocket serveur;
	
	public ServeurReservation() throws IOException
	{
		this.serveur = new ServerSocket(PORT.RESERVATION);
		System.out.println("Demarrage du serveur de reservation");
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
			Socket serveurAttente = this.serveur.accept();
			System.out.println("Service réservation : Utilisateur connecté");
			new Thread(new ServiceReservation(serveurAttente)).start();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
