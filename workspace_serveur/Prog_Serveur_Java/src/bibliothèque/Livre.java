package bibliothèque;
public class Livre implements Document {
	
	private int numéro;
	private String réservéPar;
	private String empruntéPar;
	public Livre(int numéro)
	{
		this.numéro = numéro;
		this.réservéPar = null;
		this.empruntéPar = null;
	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numéro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!Bibliothèque.identifier(ab))
			throw new PasLibreException("Numéro identifiant " +ab.getNuméro()+" non répertorié");
		else if(this.réservéPar != null)
				throw new PasLibreException("Le livre " +this.numéro+ " a déjà été réservé par l'abonné " +this.réservéPar);
		else if(this.empruntéPar != null)
			throw new PasLibreException("Le livre " + this.numéro + " ne peut être réservé car il est emprunté par l'abonné " + this.empruntéPar);
		else
		{
			this.réservéPar = ab.getNuméro();
			System.out.println("Le livre " +ab.getNuméro()+ " a été réservé par l'abonné "+ab.getNuméro()+".\nLa durée de réservation est de 2h.");
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!Bibliothèque.identifier(ab))
			throw new PasLibreException("Numéro identifiant " +ab.getNuméro()+" non répertorié");
		else if(this.réservéPar != null && this.réservéPar != ab.getNuméro())
			throw new PasLibreException("Le livre " + this.numéro + " a été réservé à l'abonné " + this.réservéPar);
		else if(this.empruntéPar != null)
			throw new PasLibreException("Le livre " + this.numéro + " a déjà été emprunté à l'abonné " + this.empruntéPar);
		else
		{
			this.empruntéPar = ab.getNuméro();
			System.out.println("Le livre " + this.numéro + " a été emprunté par l'abonné " + this.empruntéPar);
		}
		

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		this.empruntéPar = null;
		this.réservéPar = null;
	}

}
