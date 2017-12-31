package bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {
	
	private static ArrayList<Abonne> abonnes = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>();
	
	public static Abonne identifierAbonne(int numero) throws PasLibreException
	{
		Abonne resultat = null;
		for(Abonne identifier:abonnes)
		{
			if(identifier.getNumero() == numero)
			{
				resultat = identifier;
				break;
			}
		}
		if(resultat != null)
			return resultat;
		throw new PasLibreException("Numero abonne inconnu");
	}
	
	public static void ajouterDocuments(Document d)
	{
		Bibliotheque.documents.add(d);
	}
	
	public static void ajouterAbonne(int numero)
	{
		Bibliotheque.abonnes.add(new Abonne(numero));
	}

	public static Document getDocument(int numero) throws PasLibreException
	{
		Document d = null;
		for(Document identifier:documents)
		{
			if(identifier.numero() == numero)
			{
				d = identifier;
				break;
			}
		}
		if(d != null)
			return d;
		throw new PasLibreException("Document inconnu");
	}

}