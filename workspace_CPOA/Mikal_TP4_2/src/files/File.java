package files;

import fileSystem.IFile;

public class File extends AbstractFile {
   public File( String name ) { super(name); }
   public String display(String path) { return path+getName()+"\n";  }
   public String ls() { return display(""); }

   public String add(IFile d) {
	 assert false : "cannot add anything into a file";
     return "";
   }
   public IFile spawn(String name) { return new File(name); }
   
   public IFile findFile(String name) throws Exception {
	   throw new Exception("Files do not contain other files.");
   } 
}