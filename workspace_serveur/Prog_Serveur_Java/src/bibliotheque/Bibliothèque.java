package biblioth�que;

import java.util.ArrayList;

public class Biblioth�que {
	
	private static ArrayList<Abonne> abonnes  = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>(); 
	
	//� supprimer --> v�rifier si geAbonn� = null
	public static boolean identifierAbonne(int num)
	{
		boolean r�sultat = false;
		for(Abonne identifier:abonnes)
		{
			if(identifier.getNum�ro() == num)
			{
				r�sultat = true;
				break;
			}
		}
		
		return r�sultat;
	}
	//� supprimer --> v�rifier si getDocument = null
	public static boolean identifierDoc(int num)
	{
		boolean r�sultat = false;
		for(Document identifier:documents)
		{
			if(identifier.numero() == num)
			{
				r�sultat = true;
				break;
			}
		}
		
		return r�sultat;
	}
	
	public static void ajouterDocuments(Document d)
	{
		Biblioth�que.documents.add(d);
	}
	
	public static void ajouterAbonne(int num�ro)
	{
		Biblioth�que.abonnes.add(new Abonne(num�ro));
	}
	
	public static Abonne getAbonn�(int num)
	{
		Abonne resultat = null;
		for(Abonne identifier:Biblioth�que.abonnes)
		{
			if(identifier.getNum�ro() == num)
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
		for(Document identifier:Biblioth�que.documents)
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
		return Biblioth�que.documents;
	}
}
