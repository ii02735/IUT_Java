
public class Fichier implements Contenu{

	private String nom, espaceStock�;
	public Fichier(String nom, String espaceStock�)
	{
		this.nom = nom;
		this.espaceStock� = espaceStock�;
	}
	@Override
	public String sortie() {
		// TODO Auto-generated method stub
		return this.nom + " : " + this.espaceStock�;
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return this.nom;
	}
	@Override
	public void ajouter(Contenu c) {
		// TODO Auto-generated method stub
		System.err.println("L'�l�ment "+this.nom+" n'est pas un dossier !");
	}
	@Override
	public void supprimer(Contenu c) {
		// TODO Auto-generated method stub
		System.err.println("L'�l�ment "+this.nom+" n'est pas un dossier !");
		
	}
	
	
}
