package �tat;

import java.util.Date;

import appli.Commande;
import appli.�tat;

public class Pay�e implements �tat{

	@Override
	public void payer(Commande c) throws Exception{
		// TODO Auto-generated method stub
		throw new Exception("Une commande pay�e ne peut �tre pay�e une seconde fois");
		
	}

	@Override
	public void rembourser(Commande c) throws Exception{
		// TODO Auto-generated method stub
		c.set�tat(new Cr��e());
		
	}

	@Override
	public void livrer(Commande c) throws Exception{
		// TODO Auto-generated method stub
		c.setDate(new Date());
		c.set�tat(new Livr�e());
		
	}

}
