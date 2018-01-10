package commande;


public class Commande {
	private IEtatCde �tat;
	private int numero;
	
	public Commande(int numero, IEtatCde premierEtat) {
		this.numero = numero;
		this.�tat = premierEtat;
	}
	
	public void payer() {
		�tat = �tat.payer(this);
	}
	
	public String getEtat() {
		return �tat.getClass().getSimpleName();
	}
	
	public int getNum�ro() {return numero;}

	public void livrer(){
		�tat = �tat.livrer(this);
	}
	public void rembourser() {
		�tat = �tat.rembourser(this);
	}
}