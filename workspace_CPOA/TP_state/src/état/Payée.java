package état;

import java.util.Date;

import appli.Commande;
import appli.État;

public class Payée implements État{

	@Override
	public void payer(Commande c) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Une commande payée ne peut être payée une seconde fois");
		
	}

	@Override
	public void rembourser(Commande c) throws Exception{
		// TODO Auto-generated method stub
		c.setÉtat(new Créée());
		
	}

	@Override
	public void livrer(Commande c) throws Exception{
		// TODO Auto-generated method stub
		c.setDate(new Date());
		c.setÉtat(new Livrée());
		
	}

}
