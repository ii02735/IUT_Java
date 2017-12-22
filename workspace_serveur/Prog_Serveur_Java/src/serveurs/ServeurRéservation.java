package serveurs;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import service.ServiceEmprunt;

public class ServeurR�servation implements Runnable{

	public final static int PORT = 2500;
	private ServerSocket serveur;
	public ServeurR�servation() throws IOException {
		try
		{
			System.out.println("Lancement du serveur d'emprunt...");
			this.serveur = new ServerSocket(PORT);
		}catch(UnknownHostException e)
		{
			System.out.println("�chec du lancement du serveur de r�servation");
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
				System.out.println("Service de r�servation lanc�");
				new Thread(new ServiceEmprunt(socket_serveur)).start();
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
