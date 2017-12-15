package serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public abstract class Serveur implements Runnable{
	
	private ServerSocket serveur;
	protected String nomServeur;
	
	public Serveur(int port)
	{
		try {
			this.serveur = new ServerSocket(port);
			System.out.println("Serveur " +nomServeur+ " lanc� sur le port " + port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("�chec du lancement de la Socket");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�chec du lancement de la Socket");
		}
	}
	
	public abstract void setServeurName();
	public ServerSocket getSocket()
	{
		return this.serveur;
	}
}
