package biblioth�que;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Biblioth�queTest {

	private Biblioth�que b;
	private Abonne ab = new Abonne("200");
	private Abonne ab1 = new Abonne("1564");
	private Abonne ab2 = new Abonne("6846");
	
	@Before
	public void init()
	{
		this.b = Biblioth�que.getInstance();
		Biblioth�que.abonn�s.add(ab);
		Biblioth�que.abonn�s.add(ab1);
		Biblioth�que.abonn�s.add(ab2);
		Biblioth�que.documents.add(new Livre(654));
		Biblioth�que.documents.add(new Livre(644));
		Biblioth�que.documents.add(new Livre(444));
		
	}
	
	@Test
	public void Biblioth�que() throws PasLibreException {
		Biblioth�que.documents.get(0).emprunter(ab);
	}

}
