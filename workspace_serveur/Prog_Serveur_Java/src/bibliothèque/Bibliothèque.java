package bibliothèque;

import java.util.ArrayList;

public class Bibliothèque {
	
	private static ArrayList<Abonne> abonnes  = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>(); 
	
	public static boolean identifier(Abonne a)
	{
		boolean résultat = false;
		for(Abonne identifier:abonnes)
		{
			if(identifier.getNuméro() == a.getNuméro())
			{
				résultat = true;
				break;
			}
		}
		
		return résultat;
	}
	
	public static void ajouterDocuments(Document d)
	{
		Bibliothèque.documents.add(d);
	}
	
	public static void ajouterAbonne(String numéro)
	{
		Bibliothèque.abonnes.add(new Abonne(numéro));
	}
	
	public static Abonne getAbonné(int index)
	{
		return Bibliothèque.abonnes.get(index);
	}
	
	public static Document getDocument(int index)
	{
		return Bibliothèque.documents.get(index);
	}
	
	public static ArrayList<Document> getListeDoc()
	{
		return Bibliothèque.documents;
	}
}
