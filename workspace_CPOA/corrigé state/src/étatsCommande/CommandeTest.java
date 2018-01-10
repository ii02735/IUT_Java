package �tatsCommande;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import cdeExceptions.CommandeNonPayable;
import cdeExceptions.CommandeNonLivrable;
import cdeExceptions.CommandeNonRemboursable;
import commande.Commande;


public class CommandeTest {
	private Commande cde;
	private final int num = 1;
	
	@Before
	public void init(){
		cde = new Commande(num, new CdeCr��e());
	}
	
	@Test
	public void testCycleNormal() {
		assertEquals(1, cde.getNum�ro());
		assertEquals("CdeCr��e", cde.getEtat());
		cde.payer();
		assertEquals("CdePay�e", cde.getEtat());
		cde.rembourser();
		assertEquals("CdeCr��e", cde.getEtat());
		cde.payer();
		assertEquals("CdePay�e", cde.getEtat());
		cde.livrer();
		assertEquals("CdeLivr�e", cde.getEtat());
	}
	
	@Test(expected = CommandeNonLivrable.class)
	public void testNonLivrable() {
		cde.livrer();
	}
	
	@Test(expected = CommandeNonLivrable.class)
	public void testNonLivrableBis() {
		cde.payer();
		cde.rembourser();
		cde.livrer();
	}
	
	@Test(expected = CommandeNonRemboursable.class)
	public void testNonRemboursable() {
		cde.payer();
		cde.livrer();
		cde.rembourser();
	}
	
	@Test(expected = CommandeNonRemboursable.class)
	public void testNonRemboursableBis() {
		cde.rembourser();
	}
	
	@Test(expected = CommandeNonPayable.class)
	public void testD�j�Pay�e() {
		cde.payer();
		cde.payer();
	}
	
	@Test(expected = CommandeNonLivrable.class)
	public void uneSeuleLivraison() {
		cde.payer();
		cde.livrer();
		cde.livrer();
	}
}
