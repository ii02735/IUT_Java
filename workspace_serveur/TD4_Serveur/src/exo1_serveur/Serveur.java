package exo1_serveur;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Serveur implements Runnable {
	private ServerSocket serveur;
	
	public Serveur(int port)
	{
		try {
			this.serveur = new ServerSocket(port);
			System.out.println("Serveur lanc� sur le port " + port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�chec du lancement de la Socket");
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.serveur = new ServerSocket();
			while(true)
			{
				Socket Socket_Serveur = this.serveur.accept();
				
				Socket_Serveur.close();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
