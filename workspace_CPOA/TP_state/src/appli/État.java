package appli;

public interface �tat {
	
	void payer(Commande c) throws Exception;
	void rembourser(Commande c) throws Exception;
	void livrer(Commande c) throws Exception;
}
