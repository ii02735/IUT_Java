package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;

import bibliotheque.Abonne;
import bibliotheque.Bibliotheque;
import bibliotheque.Document;
import bibliotheque.PasLibreException;

public class ServiceReservation implements Runnable{
	
	private Socket serveur;
	private InputStreamReader in;
	private BufferedReader convertisseur;
	private PrintWriter out;
	private Abonne ab;
	private Timer temps;
	private int numAbonne;
	private int numero;
	private Document d;
	public ServiceReservation(Socket serveur)
	{
		this.serveur = serveur;
		this.temps = new Timer();
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
			out.println("Vous êtes sur le service de réservation");	
			out.println("read");
			out.println("Saisir le numero d'abonne");
			out.println("write");
			this.numAbonne = Integer.parseInt(convertisseur.readLine());
			
			ab = Bibliotheque.identifierAbonne(this.numAbonne);
			
			out.println("read");
			out.println("Saisir le numero du document a réserver");
			out.println("write");
			
			this.numero = Integer.parseInt(convertisseur.readLine());
			this.d = Bibliotheque.getDocument(this.numero);
			this.d.reserver(ab);
			out.println("read");
			out.println("Vous avez 10s avant la fin de la réservation");
			temps.schedule(new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Le délai de réservation sur le document " + ServiceReservation.this.numero + " a expiré");
					ServiceReservation.this.d.retour();
				}
			}, 10000);
			out.println("read");
			out.println("Réservation réussie");
			out.println("quitter");
			System.err.println("Service réservation : Utilisateur déconnecté");
		}
		catch(PasLibreException | NumberFormatException | IOException e)
		{
			System.err.println("Service réservation : Utilisateur déconnecté");
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