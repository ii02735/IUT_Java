package �tatsCommande;

import java.util.GregorianCalendar;

import cdeExceptions.CommandeNonPayable;
import commande.Commande;
import commande.IEtatCde;

public class CdePay�e implements IEtatCde {
	@Override
	public IEtatCde payer(Commande cde) {
		throw new CommandeNonPayable();
	}
	@Override
	public IEtatCde rembourser(Commande cde) {
		return new CdeCr��e();
	}
	@Override
	public IEtatCde livrer(Commande cde) {
		return new CdeLivr�e(new GregorianCalendar());
	}
}
