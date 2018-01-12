package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import service.ServiceEmprunt;

public class ServeurEmprunt extends Serveur implements Runnable{
	
	private ServerSocket serveur;
	
	public ServeurEmprunt()
	{
		super(PORT.EMPRUNT);
		this.serveur = super.getServ();
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
				System.out.println("Serveur emprunt : Utilisateur connect�");
				new Thread(new ServiceEmprunt(serveurEmpruntAttente)).start();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
