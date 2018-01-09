package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import bibliotheque.Bibliotheque;
import bibliotheque.PasLibreException;

public class ServiceRetour implements Runnable {

	private Socket serveur;
	private InputStreamReader in;
	private BufferedReader convertisseur;
	private PrintWriter out;
	
	public ServiceRetour(Socket serveur) {
		this.serveur = serveur;
		try {
			this.in = new InputStreamReader(this.serveur.getInputStream());
			this.convertisseur = new BufferedReader(in);
			this.out =  new PrintWriter(this.serveur.getOutputStream(),true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try
		{
			int numero = 0;
			System.out.println("Service retour : Utilisateur connecté");
			out.println("read");
			out.println("Vous êtes sur le service de retour");	
			
			out.println("read");
			out.println("Saisir le numero du document a rendre");
			out.println("write");
			
			numero = Integer.parseInt(convertisseur.readLine());
			
			Bibliotheque.getDocument(numero).retour();
			out.println("read");
			out.println("retour réussi");
			out.println("quitter");
			System.err.println("Service retour : Utilisateur déconnecté");
		}
		catch(PasLibreException | NumberFormatException | IOException e)
		{
			System.err.println("Service retour : Utilisateur déconnecté");
			out.println("Exception");
			out.println(e.toString());
		}
		
	}

}
