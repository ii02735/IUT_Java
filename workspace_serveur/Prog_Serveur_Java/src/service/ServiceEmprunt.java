package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import biblioth�que.Abonne;
import biblioth�que.Biblioth�que;
import biblioth�que.Document;
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
			System.out.println("Service Emprunt d�marr�");
			BufferedReader socketIn = new BufferedReader(new InputStreamReader(super.getClient().getInputStream()));
			PrintWriter socketOut = new PrintWriter(super.getClient().getOutputStream(),true);
			String saisie;
			socketOut.println("Vous �tes sur le service d'emprunt");
			boolean num�roExistant = false;
			
			saisie = new String(socketIn.readLine());
			System.out.println("Num�ro abonn� saisi" + saisie);
			a = Biblioth�que.getAbonn�(Integer.parseInt(saisie));
			if(a == null)
				throw new AbonneInconnuException();
					

			a = Biblioth�que.getAbonn�(Integer.parseInt(saisie));
			
			
			socketOut.println("Indiquez le num�ro du document � emprunter :");
			saisie = new String(socketIn.readLine());
			emprunt = Biblioth�que.getDocument(Integer.parseInt(saisie));
			if(emprunt == null)
				socketOut.println("Num�ro document non r�pertori�");
			
			
			emprunt = Biblioth�que.getDocument(Integer.parseInt(saisie));
			try {
				emprunt.emprunter(a);
				socketOut.println("Le document " + emprunt.numero() + " a bien �t� emprunt�");
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
