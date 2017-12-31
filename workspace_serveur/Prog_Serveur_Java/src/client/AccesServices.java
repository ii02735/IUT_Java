package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import serveur.PORT;

public class AccesServices implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
			try {
				System.out.println("\nChoisir le service à lancer.");
				System.out.println("- Emprunt\n- Reservation\n- Retour\n- Fermer");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String service;
				service = input.readLine();

					switch(service)
					{
						case "Emprunt":
							new Thread(new InputOutput("127.0.1.1", PORT.EMPRUNT)).start();
							break;
						case "Reservation":
							new Thread(new InputOutput("127.0.1.1", PORT.RESERVATION)).start();
							break;
						default:
							System.err.println("Service non répertorié");
							break;
					}
			} catch (IOException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}