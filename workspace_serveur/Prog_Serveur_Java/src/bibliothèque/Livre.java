package biblioth�que;
public class Livre implements Document {
	
	private int num�ro;
	private String r�serv�Par;
	private String emprunt�Par;
	public Livre(int num�ro)
	{
		this.num�ro = num�ro;
		this.r�serv�Par = null;
		this.emprunt�Par = null;
	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.num�ro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!Biblioth�que.identifier(ab))
			throw new PasLibreException("Num�ro identifiant " +ab.getNum�ro()+" non r�pertori�");
		else if(this.r�serv�Par != null)
				throw new PasLibreException("Le livre " +this.num�ro+ " a d�j� �t� r�serv� par l'abonn� " +this.r�serv�Par);
		else if(this.emprunt�Par != null)
			throw new PasLibreException("Le livre " + this.num�ro + " ne peut �tre r�serv� car il est emprunt� par l'abonn� " + this.emprunt�Par);
		else
		{
			this.r�serv�Par = ab.getNum�ro();
			System.out.println("Le livre " +ab.getNum�ro()+ " a �t� r�serv� par l'abonn� "+ab.getNum�ro()+".\nLa dur�e de r�servation est de 2h.");
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!Biblioth�que.identifier(ab))
			throw new PasLibreException("Num�ro identifiant " +ab.getNum�ro()+" non r�pertori�");
		else if(this.r�serv�Par != null && this.r�serv�Par != ab.getNum�ro())
			throw new PasLibreException("Le livre " + this.num�ro + " a �t� r�serv� � l'abonn� " + this.r�serv�Par);
		else if(this.emprunt�Par != null)
			throw new PasLibreException("Le livre " + this.num�ro + " a d�j� �t� emprunt� � l'abonn� " + this.emprunt�Par);
		else
		{
			this.emprunt�Par = ab.getNum�ro();
			System.out.println("Le livre " + this.num�ro + " a �t� emprunt� par l'abonn� " + this.emprunt�Par);
		}
		

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		this.emprunt�Par = null;
		this.r�serv�Par = null;
	}

}
