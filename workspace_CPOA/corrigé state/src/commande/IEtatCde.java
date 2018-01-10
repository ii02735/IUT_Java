package commande;

public interface IEtatCde {
	IEtatCde payer(Commande cde);
	IEtatCde rembourser(Commande cde);
	IEtatCde livrer(Commande cde);
}
