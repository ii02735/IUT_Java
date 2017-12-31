package bibliotheque;


public class Livre implements Document{
	
	private int reservataire;
	private int numero;
	private Statut statut;
	public Livre(int numero)
	{
		this.numero = numero;
		this.statut = Statut.libre;
	}

	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.numero;
	}

	@Override
	public synchronized void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		switch(this.statut)
		{
			case reserve:
					throw new PasLibreException("Le document " + this.numero + " a deja ete reserve");
			case emprunte:
				if(this.reservataire == ab.getNumero())
				{
					System.out.println("Le document " + this.numero + " a ete emprunte par l'abonne " + ab.getNumero());
					this.statut = Statut.emprunte;
					break;
				}
				else
				throw new PasLibreException("Le document " + this.numero + " a ete emprunte");
			case libre:
				System.out.println("Le document " + this.numero + " a ete reserve par l'abonne " + ab.getNumero());
				this.statut = Statut.reserve;
				this.reservataire = ab.getNumero();
				break;
		}
	}
	
	public int getReservataire()
	{
		return this.reservataire;
		
	}
	
	@Override
	public synchronized void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub

		switch(this.statut)
		{
			case reserve:
				throw new PasLibreException("Le document " + this.numero + " a ete reserve");
			case emprunte:
				throw new PasLibreException("Le document " + this.numero + " est deja sous emprunt");
			case libre:
				System.out.println("Le document " + this.numero + " a ete emprunte par l'abonne " + ab.getNumero());
				this.statut = Statut.emprunte;
				break;
		}
	}

	@Override
	public synchronized void retour() {
		// TODO Auto-generated method stub
		this.statut = Statut.libre;
	}
	
	
}
