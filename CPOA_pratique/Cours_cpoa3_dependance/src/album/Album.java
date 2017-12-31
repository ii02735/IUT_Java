package album;
import java.util.*;

public class Album {
	private ArrayList<Chanson> chansons;
	
	public Album() {
		chansons = new ArrayList<Chanson>();
	}
	
	public void ajouter(Chanson c) {
		this.chansons.add(c);
	}
	
	public void ecouter(int i) {
		assert(i<0 || i>=chansons.size());
		chansons.get(i).lancer();
	}
	
	public void menu() {
		String choix;
		while(true) {
			System.out.println("e)couter ou q)uitter");
			Scanner in = new Scanner(System.in);
			choix = in.nextLine();
			if(choix.equals("e"))
			{
				ecouter(in.nextInt());
			}
			else if(choix.equals("q"))
				break;
			else
				System.out.println("Choix invalide");
		}
			
	}
}