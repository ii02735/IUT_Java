package bibliotheque;

import java.util.Timer;
import java.util.TimerTask;

import exceptions.PasLibreException;


public class Livre implements Document{
	
	private Abonne reservataire;
	private int numero;
	private Statut statut;
	private Timer temps;
	public Livre(int numero)
	{
		this.temps = new Timer();
		this.numero = numero;
		this.statut = Statut.libre;
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
							System.out.println("Le délai de réservation sur le document " + Livre.this.numero + " a expir�");
							Livre.this.retour();
						}
					}, 7200 * 1000); // 7200s correspond à 2 heures
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
						this.temps.cancel();
						break;
					}
					else
						throw new PasLibreException("Le document " + this.numero + " est en r�servation");
				case emprunte:
					throw new PasLibreException("Le document " + this.numero + " est deja sous emprunt");
				case libre:
					System.out.println("Le document " + this.numero + " a ete emprunte par l'abonne " + ab.getNumero());
					this.statut = Statut.emprunte;
					break;
			}
		}
	}
	
	
	@Override
	public void retour() {
		this.statut = Statut.libre;
	}
	
	
}
