package serveurs;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import service.ServiceEmprunt;

public class ServeurRetour implements Runnable{
	
	public final static int PORT = 2700;
	private ServerSocket serveur;
	public ServeurRetour(int port) throws IOException {
		try
		{
			System.out.println("Lancement du serveur d'emprunt...");
			this.serveur = new ServerSocket(PORT);
		}catch(UnknownHostException e)
		{
			System.out.println("Échec du lancement du serveur d'emprunt");
		}
		
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				Socket socket_serveur = this.serveur.accept();
				System.out.println("Service de retour lancé");
				new Thread(new ServiceEmprunt(socket_serveur)).start();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
