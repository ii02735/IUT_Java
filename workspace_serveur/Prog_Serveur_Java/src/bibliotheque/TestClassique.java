package biblioth�que;

//import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestClassique {
	
	@Before
	public void prepare()
	{
		Biblioth�que.ajouterAbonne("544");
		Biblioth�que.ajouterAbonne("355");
		Biblioth�que.ajouterAbonne("654");
		Biblioth�que.ajouterDocuments(new Livre(745));
		Biblioth�que.ajouterDocuments(new Livre(746));
		Biblioth�que.ajouterDocuments(new Livre(747));
	}
	
	@Test
	public void test() throws PasLibreException {
		
		Biblioth�que.getDocument(2).emprunter(Biblioth�que.getAbonn�(0));
		Biblioth�que.getDocument(1).emprunter(Biblioth�que.getAbonn�(1));
		Biblioth�que.getDocument(0).reserver(Biblioth�que.getAbonn�(0));
		Biblioth�que.getDocument(0).emprunter(Biblioth�que.getAbonn�(1));
	}

}
