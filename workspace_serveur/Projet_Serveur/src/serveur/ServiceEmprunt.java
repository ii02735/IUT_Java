package serveur;

import java.net.Socket;

public class ServiceEmprunt implements Runnable{
	
	private static int compteur = 1;
	private final int numero;
	private final Socket client;
	
	public ServiceEmprunt(Socket socket)
	{
		this.numero = ServiceEmprunt.compteur++;
		this.client = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void lancer()
	{
		new Thread(this).start();
	}
	
	protected void finalize() throws Throwable
	{
		this.client.close();
	}
	
}
