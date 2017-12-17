import java.util.ArrayList;
import java.util.List;

public class Dossier implements Contenu{

	private String nom;
	private List<Contenu> enfants;
	
	public Dossier(String nom) {this.nom = nom; this.enfants = new ArrayList<>();}

	@Override
	public String sortie() {
		String output = this.nom +"/\n";
		for(Contenu enfants:this.enfants)
		{
			output += enfants.sortie()+"\n";
		}
		return output;
	}
	@Override
	public void ajouter(Contenu c)
	{
		System.out.println("L'�l�ment "+c.getNom() + " a �t� ajout� au dossier " + this.getNom());
		this.enfants.add(c);
	}
	@Override
	public void supprimer(Contenu c)
	{
		System.out.println("L'�l�ment "+c.getNom() + " a �t� supprim� au dossier " + this.getNom());
		this.enfants.remove(c);
	}
	@Override
	public String getNom()
	{
		return this.nom;
	}
	
	public Contenu getListe(int index)
	{
		return this.enfants.get(index);
	}
}
