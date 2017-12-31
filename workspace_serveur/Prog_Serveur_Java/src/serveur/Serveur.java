package serveur;

import java.io.IOException;
import java.net.ServerSocket;

public class Serveur implements Runnable{
	
	private ServerSocket serveur;
	private int port;
	public Serveur(int port)
	{
		this.port = port;
		try {
			this.serveur = new ServerSocket(this.port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ServerSocket getServ()
	{
		return this.serveur;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(this.port == PORT.EMPRUNT)
			new Thread(new ServeurEmprunt()).start();
		else if(this.port == PORT.RESERVATION)
			new Thread(new ServeurEmprunt()).start();
			
	}

}
