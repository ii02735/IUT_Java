
public class Fichier implements Contenu{

	private String nom, espaceStocké;
	public Fichier(String nom, String espaceStocké)
	{
		this.nom = nom;
		this.espaceStocké = espaceStocké;
	}
	@Override
	public String sortie() {
		// TODO Auto-generated method stub
		return this.nom + " : " + this.espaceStocké;
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}
	@Override
	public void ajouter(Contenu c) {
		// TODO Auto-generated method stub
		System.err.println("L'élément "+this.nom+" n'est pas un dossier !");
	}
	@Override
	public void supprimer(Contenu c) {
		// TODO Auto-generated method stub
		System.err.println("L'élément "+this.nom+" n'est pas un dossier !");
		
	}
	
	
}
