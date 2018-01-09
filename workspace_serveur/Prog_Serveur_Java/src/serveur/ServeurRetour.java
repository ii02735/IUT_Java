package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import service.ServiceRetour;

public class ServeurRetour extends Serveur implements Runnable{
	
	private ServerSocket serveur;
	
	public ServeurRetour() throws IOException {
		super(PORT.RETOUR);
		this.serveur = super.getServ();
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
