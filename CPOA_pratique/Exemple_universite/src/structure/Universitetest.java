package structure;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import factory.LEtudiantFactory;
import factory.MEtudiantFactory;

public class Universitetest {
	
	private Universite u;
	
	@Before
	public void init()
	{
		this.u = new Universite("IUT Paris Descartes", new LEtudiantFactory());
	}
	@Test
	public void ajout() {
		this.u.ajouterEtu("L1", "Barnab�");
		this.u.ajouterEtu("L2", "Yadallee");
		this.u.ajouterEtu("L1", "Edouard");
		this.u.setFabrique(new MEtudiantFactory());
		this.u.ajouterEtu("M1", "Richard");
		this.u.ajouterEtu("M2", "Philippe");
		assertNotEquals(this.u.getListe().size(),3);
		
		System.out.println(this.u.afficherListe());
	}

}
