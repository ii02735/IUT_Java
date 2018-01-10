package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import appli.Commande;
import �tat.Cr��e;

public class TestState {
	
	Commande c;
	
	@Before
	public void initCommande()
	{
		this.c = new Commande(32,new Cr��e());
	}
	
	@Test
	public void testPayer() throws Exception {
		
		this.c.payer();
		assertEquals(this.c.get�tat().getClass().getName(),"�tat.Pay�e");
		assertNotEquals(this.c.get�tat().getClass().getName(),"�tat.Livr�e");
		assertNotEquals(this.c.get�tat().getClass().getName(),"�tat.Cr��e");
	}
	
	@Test
	public void testLivrer() throws Exception
	{
		this.c.payer();
		this.c.livrer();
		assertEquals(this.c.get�tat().getClass().getName(),"�tat.Livr�e");
		this.c.rembourser();
		assertEquals(this.c.get�tat().getClass().getName(),"�tat.Cr��e");
	}

}