package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import bibliotheque.Abonne;
import bibliotheque.Bibliotheque;
import bibliotheque.Document;
import exceptions.PasLibreException;

public class ServiceReservation implements Runnable{
	
	private Socket serveur;
	private InputStreamReader in;
	private BufferedReader convertisseur;
	private PrintWriter out;
	private Abonne ab;
	private int numAbonne;
	private int numero;
	private Document d;
	public ServiceReservation(Socket serveur)
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
			

			out.println("read");
			out.println("Vous �tes sur le service de r�servation");	
			out.println("read");
			out.println("Saisir le numero d'abonne");
			out.println("write");
			this.numAbonne = Integer.parseInt(convertisseur.readLine());
			
			ab = Bibliotheque.identifierAbonne(this.numAbonne);
			
				out.println("read");
				out.println("Saisir le numero du document a r�server");
				out.println("write");
				
				this.numero = Integer.parseInt(convertisseur.readLine());
				this.d = Bibliotheque.getDocument(this.numero);
				this.d.reserver(ab);
				out.println("read");
				out.println("Vous avez 2h avant la fin de la r�servation");
				
				out.println("read");
				out.println("R�servation r�ussie");
				out.println("quitter");
				System.err.println("Service r�servation : Utilisateur d�connect�");
		}
		catch(PasLibreException | NumberFormatException | IOException e)
		{
			System.err.println("Service r�servation : Utilisateur d�connect�");
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
