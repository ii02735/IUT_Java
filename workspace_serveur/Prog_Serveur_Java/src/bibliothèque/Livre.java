package biblioth�que;

import statePattern.Disponible;
import statePattern.�tat;

public class Livre implements Document {
	
	private int num�ro;
	private �tat �tat;
	private String r�serv�Par;
	public Livre(int num�ro)
	{
		this.num�ro = num�ro;
		this.�tat = new Disponible();
		this.r�serv�Par = null;
	}
	
	@Override
	public int numero() {
		// TODO Auto-generated method stub
		return this.num�ro;
	}

	@Override
	public void reserver(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!this.�tat.identifier(ab))
			throw new PasLibreException("Num�ro identifiant " +ab.getNum�ro()+" non r�pertori�");
		else if(this.�tat.r�server(ab, this) == null)
				throw new PasLibreException("Le livre a d�j� �t� r�serv� par l'abonn� " +this.r�serv�Par);
		else
		{
			this.�tat = this.�tat.r�server(ab, this);
			System.out.println("La dur�e de r�servation est de 2h.");
		}

	}

	@Override
	public void emprunter(Abonne ab) throws PasLibreException {
		// TODO Auto-generated method stub
		if(!this.�tat.identifier(ab))
			throw new PasLibreException("Num�ro identifiant " +ab.getNum�ro()+" non r�pertori�");
		else if(this.�tat.r�server(ab, this) == null && (this.r�serv�Par!=null && this.r�serv�Par != ab.getNum�ro()))
				throw new PasLibreException("Le livre a �t� r�serv� par l'abonn� " +this.r�serv�Par+" et ne peut �tre emprunt�");
		else
			this.�tat = this.�tat.emprunt(ab, this);	

	}

	@Override
	public void retour() {
		// TODO Auto-generated method stub
		this.�tat.retour(this);

	}
	
	public void changerStatutR�servation(Abonne a)
	{
		this.r�serv�Par = a.getNum�ro();
	}
	
	public �tat get�tat() {
		return this.�tat;
	}

}
