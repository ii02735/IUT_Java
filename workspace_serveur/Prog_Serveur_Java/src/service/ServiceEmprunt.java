package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import bibliothèque.Abonne;
import bibliothèque.Bibliothèque;
import bibliothèque.Document;
import exception.AbonneInconnuException;
import exception.PasLibreException;

public class ServiceEmprunt extends Service{
	
	
	public ServiceEmprunt(Socket client) {
		super(client);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Abonne a = null;
			Document emprunt = null;
			System.out.println("Service Emprunt démarré");
			BufferedReader socketIn = new BufferedReader(new InputStreamReader(super.getClient().getInputStream()));
			PrintWriter socketOut = new PrintWriter(super.getClient().getOutputStream(),true);
			String saisie;
			socketOut.println("Vous êtes sur le service d'emprunt");
			boolean numéroExistant = false;
			
			saisie = new String(socketIn.readLine());
			System.out.println("Numéro abonné saisi" + saisie);
			a = Bibliothèque.getAbonné(Integer.parseInt(saisie));
			if(a == null)
				throw new AbonneInconnuException();
					

			a = Bibliothèque.getAbonné(Integer.parseInt(saisie));
			
			
			socketOut.println("Indiquez le numéro du document à emprunter :");
			saisie = new String(socketIn.readLine());
			emprunt = Bibliothèque.getDocument(Integer.parseInt(saisie));
			if(emprunt == null)
				socketOut.println("Numéro document non répertorié");
			
			
			emprunt = Bibliothèque.getDocument(Integer.parseInt(saisie));
			try {
				emprunt.emprunter(a);
				socketOut.println("Le document " + emprunt.numero() + " a bien été emprunté");
			} catch (PasLibreException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AbonneInconnuException e1) {
			
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.getClient().close();
	}

}
