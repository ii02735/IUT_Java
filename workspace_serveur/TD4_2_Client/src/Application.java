import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String host;
		final String port;
		if(args.length < 2)
		{
			host = "localhost";
			port = "1234";
		}
		else
		{
			host = args[0];
			port = args[1];
		}
		
		
		try {
			Socket client = new Socket(host,Integer.parseInt(port));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
