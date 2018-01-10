package instable;

import composite.Groupement;
import exceptions.CasException;

public class Salarié implements Groupement{
	private int salaire;
	public Salarié(int salaire) 
	{ 
		this.salaire = salaire; 
	}
	@Override
	public void ajouter(Groupement g) throws CasException {
		// TODO Auto-generated method stub
		throw new CasException();
		
	}
	@Override
	public int getSalaire() {
		// TODO Auto-generated method stub
		return salaire;
	}
}