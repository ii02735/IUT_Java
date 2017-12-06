package files;

import java.util.ArrayList;
import java.util.List;
import fileSystem.IFile;

public abstract class AbstractFile implements IFile  {
	private String name;
	public AbstractFile(String name) { this.name = name;}
	private static List<IFile> prototypes = new ArrayList<IFile>();
	static  {
		prototypes.add(new File("File"));
		prototypes.add(new Directory("Directory"));
	}
	public String getName() { return name; }
	public static List<IFile> getPrototypes() {
		return prototypes;
	}
	
	public static IFile create(String kind, String name) throws Exception {
		return getPrototype(kind).spawn(name);
	}
	public static IFile getRoot() {
		return new Directory("/");
	}
	private static IFile getPrototype(String kind) throws Exception  {
		for (IFile file : prototypes) {
			if (file.getName().equals(kind))
				return file;
		}
		throw new Exception("No such kind of file.");
	}

}
