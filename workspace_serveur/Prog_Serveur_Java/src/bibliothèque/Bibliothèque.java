package bibliothèque;

import java.util.ArrayList;

public class Bibliothèque {
	
	public static ArrayList<Abonne> abonnés;
	public static ArrayList<Document> documents;
	private static Bibliothèque _singleton;
	private Bibliothèque()
	{
		documents = new ArrayList<>();
	}
	public static synchronized Bibliothèque getInstance()
	{
		if(_singleton == null)
			_singleton = new Bibliothèque();
		return _singleton;
	}
}
