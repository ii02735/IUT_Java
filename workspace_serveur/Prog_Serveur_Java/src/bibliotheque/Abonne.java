package bibliothèque;

import java.util.ArrayList;
import java.util.List;

public class Abonne {
	
	private int numéro;
	private List<Document> réservés;
	private List<Document> emprunts;
	public Abonne(int numéro)
	{
		this.réservés = new ArrayList<>();
		this.emprunts = new ArrayList<>();
		this.numéro = numéro;
	}
	
	public int getNuméro()
	{
		return this.numéro;
	}
	
	public void ajouterEmprunt(Document d)
	{
		this.emprunts.add(d);
	}
	
	public void enleverEmprunt(Document d)
	{
		this.emprunts.remove(d);
	}
	
	public void réservés(Document d)
	{
		this.réservés.add(d);
	}
	
	public void enleverRéservé(Document d)
	{
		this.réservés.remove(d);
	}
	
}
