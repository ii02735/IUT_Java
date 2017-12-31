package bibliothèque;

import java.util.ArrayList;

public class Bibliothèque {
	
	private static ArrayList<Abonne> abonnes  = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>(); 
	
	//à supprimer --> vérifier si geAbonné = null
	public static boolean identifierAbonne(int num)
	{
		boolean résultat = false;
		for(Abonne identifier:abonnes)
		{
			if(identifier.getNuméro() == num)
			{
				résultat = true;
				break;
			}
		}
		
		return résultat;
	}
	//à supprimer --> vérifier si getDocument = null
	public static boolean identifierDoc(int num)
	{
		boolean résultat = false;
		for(Document identifier:documents)
		{
			if(identifier.numero() == num)
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
	
	public static void ajouterAbonne(int numéro)
	{
		Bibliothèque.abonnes.add(new Abonne(numéro));
	}
	
	public static Abonne getAbonné(int num)
	{
		Abonne resultat = null;
		for(Abonne identifier:Bibliothèque.abonnes)
		{
			if(identifier.getNuméro() == num)
			{
				resultat = identifier;
				break;
			}
		}
		
		return resultat;
	}
	
	public static Document getDocument(int num)
	{
		Document resultat = null;
		for(Document identifier:Bibliothèque.documents)
		{
			if(identifier.numero() == num)
			{
				resultat = identifier;
				break;
			}
		}
		
		return resultat;
	}
	
	
	public static ArrayList<Document> getListeDoc()
	{
		return Bibliothèque.documents;
	}
}
