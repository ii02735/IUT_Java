package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import service.ServiceRetour;



public class ServeurRetour implements Runnable{
	
	private ServerSocket serveur;
	
	public ServeurRetour() throws IOException {
		this.serveur = new ServerSocket(PORT.RETOUR);
		System.out.println("Demarrage du serveur de retour");
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
				new Thread(new ServiceRetour(socket_serveur)).start();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
