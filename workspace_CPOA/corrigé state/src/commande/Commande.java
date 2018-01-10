package commande;


public class Commande {
	private IEtatCde état;
	private int numero;
	
	public Commande(int numero, IEtatCde premierEtat) {
		this.numero = numero;
		this.état = premierEtat;
	}
	
	public void payer() {
		état = état.payer(this);
	}
	
	public String getEtat() {
		return état.getClass().getSimpleName();
	}
	
	public int getNuméro() {return numero;}

	public void livrer(){
		état = état.livrer(this);
	}
	public void rembourser() {
		état = état.rembourser(this);
	}
}