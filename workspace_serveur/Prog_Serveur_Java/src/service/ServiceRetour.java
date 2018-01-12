package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import bibliotheque.Bibliotheque;
import exceptions.PasLibreException;

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
			String reponse = "";
			int numero = 0;
			boolean abim� = false;
			
			System.out.println("Service retour : Utilisateur connect�");
			out.println("read");
			out.println("Vous �tes sur le service de retour");	
			
			out.println("read");
			out.println("Saisir le numero du document a rendre");
			out.println("write");
			
			numero = Integer.parseInt(convertisseur.readLine());

			out.println("read");
			out.println("Avez vous abim� le document ? (oui/non)");
			out.println("write");
			reponse = convertisseur.readLine();
			
			if(reponse.equals("oui")){
				abim� = true;
				out.println("read");
				out.println("Vous �tes banni pendant 1 mois");
			}
			
			Bibliotheque.getDocument(numero).retour(abim�);
			out.println("read");
			out.println("Retour r�ussi");
			out.println("quitter");
			System.err.println("Service retour : Utilisateur d�connect�");
		}
		catch(PasLibreException | NumberFormatException | IOException e)
		{
			System.err.println("Service retour : Utilisateur d�connect�");
			out.println("Exception");
			out.println(e.toString());
		}
		
	}

}
