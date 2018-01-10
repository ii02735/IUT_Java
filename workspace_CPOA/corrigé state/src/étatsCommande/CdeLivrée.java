package �tatsCommande;

import java.util.GregorianCalendar;

import cdeExceptions.CommandeNonLivrable;
import cdeExceptions.CommandeNonRemboursable;
import commande.Commande;
import commande.IEtatCde;

public class CdeLivr�e implements IEtatCde {
	private GregorianCalendar dateLivraison;
	
	public CdeLivr�e(GregorianCalendar dateLivraison) {
		this.dateLivraison = dateLivraison;
	}
	@Override
	public IEtatCde payer(Commande cde) {
		return this;
	}
	@Override
	public IEtatCde rembourser(Commande cde) {
		throw new CommandeNonRemboursable ();
	}
	@Override
	public IEtatCde livrer(Commande cde) {
		throw new CommandeNonLivrable();
	}
}
