import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileSystemTest {

	private Dossier folder;
	@Before
	public void init()
	{
		this.folder = new Dossier("Test");
	}
	@Test
	public void test() {
		this.folder.ajouter(new Dossier("Test2"));
		this.folder.ajouter(new Fichier("fichier.txt","2 ko"));
		this.folder.getListe(1).ajouter(new Fichier("dummy","0 ko"));
		this.folder.getListe(0).ajouter(new Fichier("Not_dummy.txt","2 ko"));
		this.folder.ajouter(new Fichier("fichier2.txt","3 ko"));
		this.folder.ajouter(new Fichier("fichier3.txt","2 ko"));
		this.folder.ajouter(new Dossier("Test3"));
		System.out.println(this.folder.sortie());
		this.folder.supprimer(this.folder.getListe(2));
		System.out.println(this.folder.sortie());
		
	}

}
