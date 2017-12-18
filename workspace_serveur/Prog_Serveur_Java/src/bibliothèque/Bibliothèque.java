package biblioth�que;

import java.util.ArrayList;

public class Biblioth�que {
	
	public static ArrayList<Abonne> abonn�s;
	public static ArrayList<Document> documents;
	private static Biblioth�que _singleton;
	private Biblioth�que()
	{
		documents = new ArrayList<>();
	}
	public static synchronized Biblioth�que getInstance()
	{
		if(_singleton == null)
			_singleton = new Biblioth�que();
		return _singleton;
	}
}
