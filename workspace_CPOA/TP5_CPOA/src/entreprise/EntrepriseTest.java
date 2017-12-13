package entreprise;

import static org.junit.Assert.*;


import org.junit.Test;

public class EntrepriseTest {

	@Test
	public void ServiceAdmin() throws IllegalArgumentException, ServiceExistantException {
		Entreprise e = new Entreprise();
		e.addService("Admin", "Administratif");
		e.addService("Admin2", "Administratif");
		assertTrue(e.searchServiceByNom("Admin")!=null);
		/*Impossible de trouver un second service Administratif
		 * car la classe doit respecter le pattern du Singleton
		 */
		assertFalse(e.searchServiceByNom("Admin2")!=null);
	}

}
