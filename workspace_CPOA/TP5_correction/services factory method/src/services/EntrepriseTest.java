package services;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import entreprise.Entreprise;
import entreprise.IPersonnel;
import entreprise.IService;
import entreprise.ServiceExistantException;

public class EntrepriseTest {
	private Entreprise e;
	private String typeAdmin = "Administratif";
	private String nomServiceAdmin = "Service Administratif";
	private String typeTech = "Technique";
	private String typeFaux = "Commercial";
	private String nomST1 = "infrastructure";
	private String nomST2 = "realisation";
	private String nomSABis = "admin";
	private String nomSFaux = "Europe";

	@Before
	public void init(){
		e = new Entreprise(new services.ServiceFactory());
	}
	@Test
	public void typeDeServiceInconnu() {
			try {
				e.addService(nomSFaux,typeFaux);
				fail();
			} catch (IllegalArgumentException e) {
				// ok 
			}catch (ServiceExistantException e) {
				fail();
			}
	}
	public void checkService(String nom) {
		IService s = e.searchServiceByNom(nom);
		assertNotNull(s);
		assertEquals(nom,s.getNom());
	}
	@Test
	public void test() {
		try {
			e.addService(nomST1,typeTech);
			e.addService(nomST2,typeTech);
			e.addService(typeAdmin,typeAdmin);
		} catch (Exception e) {
			fail();
		}
		checkService(nomST1);
		checkService(nomST2);
		checkService(nomServiceAdmin);
		try {
			e.addService(nomST1,typeTech);
			fail();
		}
		catch (ServiceExistantException e) {
			//ok
		}
		catch  (IllegalArgumentException e) {
			fail();
		}
	
		e.addService(nomSABis,typeAdmin);
		assertNull(e.searchServiceByNom(nomSABis));
	}
	
	@Test
	public void testEmbauche() {
		e.addService(typeAdmin,typeAdmin);
		IService sadmin = e.searchServiceByNom(nomServiceAdmin);
		try {
            e.embaucher("12345", "money penny", nomServiceAdmin);
            IPersonnel p = sadmin.chercherParMatricule("12345");
            assertNotNull(p);
            assertEquals("money penny", p.getNom());
        } catch(IllegalArgumentException ex) {
            fail();
        } catch (Exception ex) {
        	fail();
        }
	}
}
