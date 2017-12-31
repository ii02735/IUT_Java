package bibliothèque;

import exception.PasLibreException;

public class Livre implements Document {
	
	private int numéro;
	private Statut statut;
	public Livre(int numéro)
	{
		this.numéro = numéro;
		this.statut = Statut.libre;

	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numéro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		switch(this.statut)
		{
			case réservé:
				throw new PasLibreException("Le document "+this.numéro+" a déjà été réservé");
			case emprunté:
				throw new PasLibreException("Le document "+this.numéro+" a été emprunté");
			case libre:
				System.out.println("Le document " + this.numéro + " a été réservé par l'abonné " + ab.getNuméro());
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		switch(this.statut)
		{
			case réservé:
				throw new PasLibreException("Le document "+this.numéro+" a été réservé.");
			case emprunté:
				throw new PasLibreException("Le document "+this.numéro+" est déjà sous emprunt.");
			case libre:
				System.out.println("Le document " + this.numéro + " a été emprunté par l'abonné " + ab.getNuméro());
		}
		

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		
	}

}
