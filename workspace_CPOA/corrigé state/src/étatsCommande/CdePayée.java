package étatsCommande;

import java.util.GregorianCalendar;

import cdeExceptions.CommandeNonPayable;
import commande.Commande;
import commande.IEtatCde;

public class CdePayée implements IEtatCde {
	@Override
	public IEtatCde payer(Commande cde) {
		throw new CommandeNonPayable();
	}
	@Override
	public IEtatCde rembourser(Commande cde) {
		return new CdeCréée();
	}
	@Override
	public IEtatCde livrer(Commande cde) {
		return new CdeLivrée(new GregorianCalendar());
	}
}
