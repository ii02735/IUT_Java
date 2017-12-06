package client;
import java.util.Scanner;

import fileSystem.IFile;
import files.AbstractFile;


public class FSClient {
   private Scanner sc = new Scanner(System.in);
   private IFile root = AbstractFile.getRoot();
   private boolean exit = false;
   private IFile cd;
   
   public FSClient() {
	  this.cd = root;
   }
   
   public static void main( java.lang.String[] args ) {
	   new FSClient().session();
   }
   
   public void session() {
	   while (! exit) {
		   eval(read()); 
	   }
   }
   
   private  String read() {
	   System.out.print("> ");
	   return sc.next();
   }
   
   public void cd() {
	   String name = read();
	try {
		if (name.equals(root.getName()))
			cd = root;
		else cd = cd.findFile(name);
	} 
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
   }
   
   public void create() {
	   System.out.println("What do you want to create ?");
	   for (IFile file : AbstractFile.getPrototypes()) {
		   System.out.print(file.getName() + " ");
	   }
	   System.out.println("\n");
	   String kind = read();
	   System.out.println("What name for the new "+ kind + " ?");
	   String name= read();
	   try {
		  cd.add(AbstractFile.create(kind, name));
	    } catch (Exception e) {
	    	System.out.println(e.getMessage());
	    }
    }

   
   public  void eval(String input) {
	   if (input.equals("exit")) {
		   System.out.println("bye now.");
		   exit = true;
	   }
	   else if (input.equals("pwd"))
		   System.out.print(cd.display(""));
	   else if (input.equals("ls"))
		   System.out.print(cd.ls());
	   else if (input.equals("cd")) 
		   cd();
	   else if (input.equals("create"))
		   create();
	   else System.out.println("unknown command " + input);
   }
}
