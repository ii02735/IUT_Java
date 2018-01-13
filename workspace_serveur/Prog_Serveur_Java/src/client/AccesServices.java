package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import service.AccesServiceFactory;

import exceptions.AccesException;

public class AccesServices implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		
			try {
				IAccesServicesFactory acces = new AccesServiceFactory();
				System.out.println("\nChoisir le service à lancer.");
				System.out.println("- Emprunt\n- Reservation\n- Retour");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				String service;
				service = input.readLine();
				new Thread(acces.creerAcces(service)).start();

			} catch (IOException | AccesException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
