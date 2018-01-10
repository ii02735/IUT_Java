package �tat;

import java.util.Date;

import appli.Commande;
import appli.�tat;

public class Livr�e implements �tat{

	@Override
	public void payer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("Une commande livr�e ne peut �tre pay�e");
		
	}

	@Override
	public void rembourser(Commande c) throws Exception {
		// TODO Auto-generated method stub
		if(this.getDays(c.getDate(), new Date()) < 14)
		{
			c.set�tat(new Cr��e());
		}
		else
		{
			throw new Exception("Le d�lai de remboursement a expir�");
		}
		
	}

	@Override
	public void livrer(Commande c) throws Exception {
		// TODO Auto-generated method stub
		
		throw new Exception("Une commande livr�e ne peut l'�tre une seconde fois");
		
	}
	
	private long getDays(Date d1, Date d2) 
	{
		long diff = d1.getTime() - d2.getTime();
	    return diff/(24 * 60 * 60 * 1000);
	}

}
