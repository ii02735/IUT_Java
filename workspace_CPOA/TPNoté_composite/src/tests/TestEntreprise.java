﻿package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import composite.Groupement;
import exceptions.CasException;
import instable.Entreprise;
import instable.Salarié;

public class TestEntreprise {
	@Test
	public void test() throws CasException {
		Groupement e1 = new Entreprise();
		e1.ajouter(new Salarié(1500));
		e1.ajouter(new Salarié(2000));
		assertEquals(3500, e1.getSalaire());
		Groupement e2 = new Entreprise();
		e2.ajouter(new Salarié(2000));
		assertEquals(2000, e2.getSalaire());
	}
	
	@Test
	public void testAcquisition() throws CasException
	{
		Groupement e1 = new Entreprise();
		e1.ajouter(new Salarié(1500));
		e1.ajouter(new Salarié(2000));
		assertEquals(3500, e1.getSalaire());
		Groupement e2 = new Entreprise();
		e2.ajouter(new Salarié(2000));
		assertEquals(2000, e2.getSalaire()); 
		//Acquisition Entreprise
		e1.ajouter(e2);
		assertEquals(5500,e1.getSalaire());
	}
}
