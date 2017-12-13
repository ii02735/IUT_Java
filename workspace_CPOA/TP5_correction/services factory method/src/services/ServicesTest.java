package services;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicesTest {

	@Test
	public void testServiceAdministratif() {
		Service s1 = ServAdministratif.getInstance();
		assertEquals(s1.getNom(), "Service Administratif");
		assertEquals(s1.getClass(), ServAdministratif.class);
		assertEquals(s1.getType(), "Administratif");
		Service s2 = ServAdministratif.getInstance();
		assertTrue(s1 == s2);
	}
	
	

}
