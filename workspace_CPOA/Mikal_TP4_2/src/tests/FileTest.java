package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import files.File;

public class FileTest {

	@Test
	public void test() {
		String nom ="Mes documents";
		File f = new File(nom);
		assertEquals(f.getName(), nom);
		assertEquals(f.display(""), nom + "\n");
	}

}
