package biblioth�que;

import exception.PasLibreException;

public class Livre implements Document {
	
	private int num�ro;
	private Statut statut;
	public Livre(int num�ro)
	{
		this.num�ro = num�ro;
		this.statut = Statut.libre;

	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.num�ro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		switch(this.statut)
		{
			case r�serv�:
				throw new PasLibreException("Le document "+this.num�ro+" a d�j� �t� r�serv�");
			case emprunt�:
				throw new PasLibreException("Le document "+this.num�ro+" a �t� emprunt�");
			case libre:
				System.out.println("Le document " + this.num�ro + " a �t� r�serv� par l'abonn� " + ab.getNum�ro());
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		switch(this.statut)
		{
			case r�serv�:
				throw new PasLibreException("Le document "+this.num�ro+" a �t� r�serv�.");
			case emprunt�:
				throw new PasLibreException("Le document "+this.num�ro+" est d�j� sous emprunt.");
			case libre:
				System.out.println("Le document " + this.num�ro + " a �t� emprunt� par l'abonn� " + ab.getNum�ro());
		}
		

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		
	}

}
