import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


import serveurs.ServeurEmprunt;

public class Client{
	
	public static void main(String[] args)
	{
		String nomService;
		Socket client;
		String num = "";
		String adresseIPBiblioth�que = "127.0.1.1";
		try{

			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			do
			{
				System.out.println("Choisir le service � lancer :");
				System.out.print("- Emprunt\n-R�servation\n-Retour");
				nomService = input.readLine();
				switch(nomService)
				{
					case "Emprunt":
						client = new Socket(adresseIPBiblioth�que,ServeurEmprunt.PORT);
						BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream())); //on r�cup�re la saisie du client
						PrintWriter out = new PrintWriter(client.getOutputStream(),true);//transmission d'un message au client
						
						System.out.println("Indiquez le num�ro d'abonn�");
						num = input.readLine(); 
						out.println(num);
						//while(in.readLine() == 
					default:
						System.out.println("Service non existant.");
						
				}
			}while(true);
		}catch(UnknownHostException e)
		{
			e.printStackTrace();
			System.err.println("Adresse inaccessible");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
