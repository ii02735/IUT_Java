package statePattern;

import bibliothèque.Abonne;
import bibliothèque.Bibliothèque;
import bibliothèque.Document;

public abstract class État {
	
	public boolean identifier(Abonne a) {
		boolean résultat = false;
		for(Abonne identifier : Bibliothèque.abonnés)
		{
			if(a.getNuméro() == identifier.getNuméro())
			{
				résultat = true;
				break;
			}
				
		}
		return résultat;
	}
	boolean identificationDocument(Document d)
	{
		boolean résultat = false;
		for(Document identifier:Bibliothèque.documents)
		{
			if(identifier.numero() == d.numero())
			{
				résultat = true;
				break;
			}
		}
		return résultat;
	}
	public abstract État emprunt(Abonne a,Document d);
	public abstract État réserver(Abonne a,Document d);
	public abstract État retour(Document l);
}
