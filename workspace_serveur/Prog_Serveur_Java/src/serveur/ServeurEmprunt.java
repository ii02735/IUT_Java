package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import service.ServiceEmprunt;



public class ServeurEmprunt implements Runnable{
	
	private ServerSocket serveur;
	
	public ServeurEmprunt() throws IOException
	{
		this.serveur = new ServerSocket(PORT.EMPRUNT);
		System.out.println("Demarrage du serveur d'emprunt");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket serveurEmpruntAttente = this.serveur.accept();
				System.out.println("Service emprunt : Utilisateur connecté");
				new Thread(new ServiceEmprunt(serveurEmpruntAttente)).start();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
