package état;

import appli.Commande;
import appli.État;

public class Remboursée implements État{

	@Override
	public void payer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		c.setÉtat(new Payée());
		
	}

	@Override
	public void rembourser(Commande c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Une commande remboursée ne peut l'être une seconde fois");
		
	}

	@Override
	public void livrer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Une commande remboursée ne peut être livrée");
	}

}
