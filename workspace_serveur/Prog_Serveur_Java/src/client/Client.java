package client;

public class Client {
	
	public static void main(String[]args)
	{
		new Thread(new AccesServices()).start();
	}
}
