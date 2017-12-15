package fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IElement{

	private String name;
	private List<IElement> files = new ArrayList<IElement>();
	
	public Directory(String name) {
		this.name = name;
	}

	public void add(IElement d) {
		files.add(d);
	}
	
	public String display(String path) {
		String sortie = path + getName() + "\n";
		String npath = path + name +"/";
		for (IElement f : files)
			sortie += f.display(npath);
		return sortie;
		
	}
	
	@Override
	public String ls() {
		return display("");
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}