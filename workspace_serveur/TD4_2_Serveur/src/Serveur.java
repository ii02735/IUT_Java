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
			System.out.println("�chec du lancement de la Socket");
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
			while(true)
			{
				
				Socket Socket_Serveur = this.serveur.accept();
				System.out.println("Connexion "+ Service.cpt  + " d�marr�e");
				new Thread(new Service(Socket_Serveur)).start(); //� chaque initialisation le num�ro de connexion sera incr�ment�
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}