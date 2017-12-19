package biblioth�que;

import java.util.ArrayList;

public class Biblioth�que {
	
	private static ArrayList<Abonne> abonnes  = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>(); 
	
	public static boolean identifier(Abonne a)
	{
		boolean r�sultat = false;
		for(Abonne identifier:abonnes)
		{
			if(identifier.getNum�ro() == a.getNum�ro())
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
	
	public static void ajouterAbonne(String num�ro)
	{
		Biblioth�que.abonnes.add(new Abonne(num�ro));
	}
	
	public static Abonne getAbonn�(int index)
	{
		return Biblioth�que.abonnes.get(index);
	}
	
	public static Document getDocument(int index)
	{
		return Biblioth�que.documents.get(index);
	}
	
	public static ArrayList<Document> getListeDoc()
	{
		return Biblioth�que.documents;
	}
}
