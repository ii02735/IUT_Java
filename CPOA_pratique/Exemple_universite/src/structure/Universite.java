package structure;

import java.util.ArrayList;

import factory.IEtudiantFactory;

public class Universite {
	
	private IEtudiantFactory fabrique;
	private ArrayList<Etudiant> listeEtu;
	private String nom;
	
	public Universite(String nom,IEtudiantFactory fabrique) {
		this.nom = nom;
		setFabrique(fabrique);
		this.listeEtu = new ArrayList<>();
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public void ajouterEtu(String annee, String nom)
	{
		Etudiant e = fabrique.buildEtudiant(annee, nom);
		this.listeEtu.add(e);
	}
	
	public ArrayList<Etudiant> getListe()
	{
		return this.listeEtu;
	}
	
	public void setFabrique(IEtudiantFactory fabrique)
	{
		this.fabrique = fabrique;
	}
	
	public String afficherListe()
	{
		String s = "";
		for(Etudiant e : this.listeEtu)
			s+=e.getName() + " " + e.getClass().getName()+"\n";
		return s;
	}
}
