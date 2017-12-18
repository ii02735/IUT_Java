package bibliothèque;

import statePattern.Disponible;
import statePattern.État;

public class Livre implements Document {
	
	private int numéro;
	private État état;
	private String réservéPar;
	public Livre(int numéro)
	{
		this.numéro = numéro;
		this.état = new Disponible();
		this.réservéPar = null;
	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numéro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!this.état.identifier(ab))
			throw new PasLibreException("Numéro identifiant " +ab.getNuméro()+" non répertorié");
		else if(this.état.réserver(ab, this) == null)
				throw new PasLibreException("Le livre a déjà été réservé par l'abonné " +this.réservéPar);
		else
		{
			this.état = this.état.réserver(ab, this);
			System.out.println("La durée de réservation est de 2h.");
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!this.état.identifier(ab))
			throw new PasLibreException("Numéro identifiant " +ab.getNuméro()+" non répertorié");
		else if(this.état.réserver(ab, this) == null && (this.réservéPar!=null && this.réservéPar != ab.getNuméro()))
				throw new PasLibreException("Le livre a été réservé par l'abonné " +this.réservéPar+" et ne peut être emprunté");
		else
			this.état = this.état.emprunt(ab, this);	

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		this.état.retour(this);

	}
	
	public void changerStatutRéservation(Abonne a)
	{
		this.réservéPar = a.getNuméro();
	}
	
	public État getÉtat() {
		return this.état;
	}

}
