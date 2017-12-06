import fileSystem.Directory;
import fileSystem.File;

public class FSClient {
   public static void main( java.lang.String[] args ) {
      Directory d = new Directory("dir1");
      File  f = new File("a");
      d.add(f); f.ls(); d.ls();
      //Commandes proposées à l'utilisateur pour la gestion des fichiers
   }
}