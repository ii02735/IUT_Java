

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Service implements Runnable{
	
	private Socket SocketClient;
	public static int cpt = 1;
	private final int numero;
	public Service(Socket SocketClient)
	{
		this.SocketClient = SocketClient;
		this.numero = cpt++; //Ce morceau de code est seulement ex�cut� par LE serveur (il n'en existe qu'un seul --> il n'y a pas une autre pile d'ex�cution (pas de partage de serveur), donc cela est thread safe
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			BufferedReader socketIn = new BufferedReader(new InputStreamReader(this.SocketClient.getInputStream()));
			PrintWriter socketOut = new PrintWriter(this.SocketClient.getOutputStream(),true);
			StringBuffer message = new StringBuffer(socketIn.readLine());
			System.out.println("Connexion "+this.numero+ " a re�u " + message);
			message.reverse(); //On inverse le message
			System.out.println("Connexion 1 termin�e");
			socketOut.println(message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		this.SocketClient.close();
	}
	
}
