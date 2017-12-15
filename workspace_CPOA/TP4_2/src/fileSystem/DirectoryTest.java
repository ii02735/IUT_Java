package fileSystem;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirectoryTest {

	@Test
	public void test() {
		String nomf ="Mes documents";
		String nomd = "dir";
		File f = new File(nomf);
		Directory d = new Directory(nomd);
		assertEquals(d.getName(), nomd);
		assertEquals(f.display(""), nomf+"\n");
		assertEquals(d.display(""), nomd+"\n");
		d.add(f);
		assertEquals( nomd+"\n"+ nomd+"/"+nomf+"\n", d.display(""));
	}

}