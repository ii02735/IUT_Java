package fileSystem;

public interface IFile {
	String add(IFile d);
	String display(String path);
	String ls();
	String getName();

	IFile spawn(String name);
	IFile findFile(String name) throws Exception;
}