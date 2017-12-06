package fileSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileTest {
	@Test
	public void test() {
		String nom ="Mes documents";
		IElement f = new File(nom);
		assertEquals(f.getName(), nom);
		assertEquals(f.display(""), nom + "\n");
	}
}
