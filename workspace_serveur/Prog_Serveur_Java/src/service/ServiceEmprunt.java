package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import bibliotheque.Abonne;
import bibliotheque.Bibliotheque;
import exceptions.PasLibreException;

public class ServiceEmprunt implements Runnable{
	
	private Socket serveur;
	private InputStreamReader in;
	private BufferedReader convertisseur;
	private PrintWriter out;
	private Abonne ab;
	
	public ServiceEmprunt(Socket serveur)
	{
		this.serveur = serveur;
		try {
			this.in = new InputStreamReader(this.serveur.getInputStream());
			this.convertisseur = new BufferedReader(in);
			this.out =  new PrintWriter(this.serveur.getOutputStream(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			int numero = 0;
			System.out.println("Service emprunt : Utilisateur connecté");
			out.println("read");
			out.println("Vous êtes sur le service d'emprunt");	
			out.println("read");
			out.println("Saisir le numero d'abonne");
			out.println("write");
			numero = Integer.parseInt(convertisseur.readLine());
			
			ab = Bibliotheque.identifierAbonne(numero);
			
			out.println("read");
			out.println("Saisir le numero du document a emprunter");
			out.println("write");
			
			numero = Integer.parseInt(convertisseur.readLine());
			
			Bibliotheque.getDocument(numero).emprunter(ab);
			out.println("read");
			out.println("Emprunt réussi");
			out.println("quitter");
			System.err.println("Service emprunt : Utilisateur déconnecté");
		}
		catch(PasLibreException | NumberFormatException | IOException e)
		{
			System.err.println("Service emprunt : Utilisateur déconnecté");
			out.println("Exception");
			out.println(e.toString());
		}
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		this.serveur.close();
	}
	
}
