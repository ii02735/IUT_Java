package étatsCommande;

import cdeExceptions.CommandeNonLivrable;
import cdeExceptions.CommandeNonRemboursable;
import commande.Commande;
import commande.IEtatCde;

public class CdeCréée implements IEtatCde {
	@Override
	public IEtatCde payer(Commande cde) {
		return new CdePayée();
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
