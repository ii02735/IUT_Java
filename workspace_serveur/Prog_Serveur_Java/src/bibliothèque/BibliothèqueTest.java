package bibliothèque;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BibliothèqueTest {

	private Bibliothèque b;
	private Abonne ab = new Abonne("200");
	private Abonne ab1 = new Abonne("1564");
	private Abonne ab2 = new Abonne("6846");
	
	@Before
	public void init()
	{
		this.b = Bibliothèque.getInstance();
		Bibliothèque.abonnés.add(ab);
		Bibliothèque.abonnés.add(ab1);
		Bibliothèque.abonnés.add(ab2);
		Bibliothèque.documents.add(new Livre(654));
		Bibliothèque.documents.add(new Livre(644));
		Bibliothèque.documents.add(new Livre(444));
		
	}
	
	@Test
	public void Bibliothèque() throws PasLibreException {
		Bibliothèque.documents.get(0).emprunter(ab);
	}

}
