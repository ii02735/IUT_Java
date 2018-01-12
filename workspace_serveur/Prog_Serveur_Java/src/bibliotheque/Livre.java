package bibliotheque;

import java.util.Timer;
import java.util.TimerTask;

import exceptions.PasLibreException;


public class Livre implements Document{
	// temps en ms
	private final int tempsEmpruntMax = 10000;
	private final int tempsReservation = 7200 * 1000; // 7200s correspond à 2 heures
	
	private Abonne reservataire;
	private int numero;
	private Statut statut;
	private Timer temps;
	private Abonne emprunteur;
	
	public Livre(int numero)
	{
		this.temps = new Timer();
		this.numero = numero;
		this.statut = Statut.libre;
		emprunteur = null;
	}

	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numero;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		synchronized(this)
		{
			switch(this.statut)
			{
				case reserve:
					throw new PasLibreException("Le document " + this.numero + " a deja ete reserve");
				case emprunte:
					throw new PasLibreException("Le document " + this.numero + " est deja sous emprunt");
				case libre:
					System.out.println("Le document " + this.numero + " a ete reserve par l'abonne " + ab.getNumero());
					this.statut = Statut.reserve;
					this.reservataire = ab;
					temps.schedule(new TimerTask() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							System.out.println("Le délai de réservation sur le document " + Livre.this.numero + " a expiré");
							Livre.this.retour(false);
						}
					}, this.tempsReservation); 
					break;
			}
		}
	}
	
	public Abonne getReservataire()
	{
		return this.reservataire;
		
	}
	
	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		
		synchronized(this)
		{
			switch(this.statut)
			{
				case reserve:
					if(this.reservataire == ab)
					{
						System.out.println("Le document " + this.numero + " a ete emprunte par l'abonne " + ab.getNumero());
						this.statut = Statut.emprunte;
						this.emprunteur = ab;
						this.temps.cancel();//Si un timer de temps de réservation est actif
						temps.schedule(new TimerTask() {
							
							@Override
							public void run() {
								Livre.this.emprunteur.setEstBanni(true);
								
							}
						}, tempsEmpruntMax);
						break;
					}
					else
						throw new PasLibreException("Le document " + this.numero + " est en réservation");
				case emprunte:
					throw new PasLibreException("Le document " + this.numero + " est deja sous emprunt");
				case libre:
					System.out.println("Le document " + this.numero + " a ete emprunte par l'abonne " + ab.getNumero());
					this.statut = Statut.emprunte;
					this.emprunteur = ab;
					temps.schedule(new TimerTask() {
						
						@Override
						public void run() {
							Bibliotheque.bannir(emprunteur);
							
						}
					}, tempsEmpruntMax);
					break;
			}
		}
	}
	
	
	@Override
	public void retour(boolean estAbimé) {
		if(estAbimé)
			Bibliotheque.bannir(emprunteur);
		this.statut = Statut.libre;
		this.temps.cancel();
	}
	
}
