package �tat;

import appli.Commande;
import appli.�tat;

public class Rembours�e implements �tat{

	@Override
	public void payer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		c.set�tat(new Pay�e());
		
	}

	@Override
	public void rembourser(Commande c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Une commande rembours�e ne peut l'�tre une seconde fois");
		
	}

	@Override
	public void livrer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Une commande rembours�e ne peut �tre livr�e");
	}

}
