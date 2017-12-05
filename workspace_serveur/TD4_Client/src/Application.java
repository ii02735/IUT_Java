import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket client = new Socket("127.0.1.1",1234);
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream())); //on r�cup�re la saisie du client
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);//transmission d'un message au client
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Connect� au serveur " + client.getInetAddress() + ":" + client.getPort());
			
			String ligne;
			
			System.out.println("Tapez un texte � inverser");
			System.out.println("->");
			ligne = input.readLine(); //Lecture de la saisie
			out.println(ligne); //Affichage au serveur
			ligne = in.readLine(); //Transmission de la cha�ne invers�e depuis le serveur
			System.out.println("Votre cha�ne invers�e\n" + ligne);
			in.close();
			out.close();
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.err.println("Adresse inaccessible");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
