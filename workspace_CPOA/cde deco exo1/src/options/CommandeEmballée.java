package options;

import commerce.ICommande;

public abstract class CommandeEmballée implements ICommande{
	private ICommande commande;
	public CommandeEmballée(ICommande commande) {
		this.commande = commande;
	}
	@Override
	public double getMontant() {
		return commande.getMontant();
	}
	@Override
	public int getNumero() {
		return commande.getNumero();
	}
}
