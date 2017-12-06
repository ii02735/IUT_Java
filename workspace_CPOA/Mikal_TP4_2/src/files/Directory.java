package files;

import java.util.ArrayList;
import java.util.List;

import fileSystem.IFile;

public class Directory extends AbstractFile {
   public Directory( String name ) { super(name); }
   public String display(String path) {
	  String output = path + getName() + "\n";
      String npath = path + getName() +"/";
      for(IFile f: files)
         output += f.display(npath);
      return output;
   }
   public String ls(){ return display(""); }
   public IFile spawn(String name) { return new Directory(name); }  
   public String add( IFile f ) {
	      files.add( f );
	      return "";
	   }
   
   private List<IFile> files = new ArrayList<IFile>();
   
   public IFile findFile(java.lang.String name) throws Exception {
	   for (IFile file : files)
		   if (file.getName().equals(name))
			   return file;
	   throw new Exception ("no such file in " + name);
   }  
}