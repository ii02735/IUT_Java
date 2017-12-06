package fileSystem;

public interface IElement {

	String display(String path);
	String ls();
	String getName();
	void add(IElement d);
	
}
