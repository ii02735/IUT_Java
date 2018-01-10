package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bridge.ICalcul;
import bridge.Maison;
import calcul.CalculTaxe;

public class MaisonTest {

	private ICalcul calcul;
	
	@Before
	public void init()
	{
		this.calcul = new CalculTaxe();
	}
	
	@Test
	public void test() {
		Maison v1 = new Maison(100,  1500);
		v1.choisirCalcul(calcul);
		assertEquals(3000, v1.getTaxe());
	}
	
	@Test
	public void testValLocative(){
		Maison v2 = new Maison(60,900);
		v2.choisirCalcul(calcul);
		assertEquals(0,v2.getMontant());
	}
}
