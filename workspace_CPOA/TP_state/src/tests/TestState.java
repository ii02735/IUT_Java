package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import appli.Commande;
import état.Créée;

public class TestState {
	
	Commande c;
	
	@Before
	public void initCommande()
	{
		this.c = new Commande(32,new Créée());
	}
	
	@Test
	public void testPayer() throws Exception {
		
		this.c.payer();
		assertEquals(this.c.getÉtat().getClass().getName(),"état.Payée");
		assertNotEquals(this.c.getÉtat().getClass().getName(),"état.Livrée");
		assertNotEquals(this.c.getÉtat().getClass().getName(),"état.Créée");
	}
	
	@Test
	public void testLivrer() throws Exception
	{
		this.c.payer();
		this.c.livrer();
		assertEquals(this.c.getÉtat().getClass().getName(),"état.Livrée");
		this.c.rembourser();
		assertEquals(this.c.getÉtat().getClass().getName(),"état.Créée");
	}

}
