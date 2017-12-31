package bibliothèque;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestClassique {
	
	@Before
	public void prepare()
	{
		Bibliothèque.ajouterAbonne("544");
		Bibliothèque.ajouterAbonne("355");
		Bibliothèque.ajouterAbonne("654");
		Bibliothèque.ajouterDocuments(new Livre(745));
		Bibliothèque.ajouterDocuments(new Livre(746));
		Bibliothèque.ajouterDocuments(new Livre(747));
	}
	
	@Test
	public void test() throws PasLibreException {
		
		Bibliothèque.getDocument(2).emprunter(Bibliothèque.getAbonné(0));
		Bibliothèque.getDocument(1).emprunter(Bibliothèque.getAbonné(1));
		Bibliothèque.getDocument(0).reserver(Bibliothèque.getAbonné(0));
		Bibliothèque.getDocument(0).emprunter(Bibliothèque.getAbonné(1));
	}

}
