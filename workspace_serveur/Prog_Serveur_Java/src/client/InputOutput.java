package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class InputOutput implements Runnable{

	private Socket client;
	private BufferedReader in;
	private BufferedReader input;
	private PrintWriter out;
	public InputOutput(String adresse, int port)
	{
		try {
			this.client = new Socket(adresse,port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			boolean close = false;
			String line;
			in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			input = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(client.getOutputStream(),true);
			while(!close)
			{
				switch(in.readLine())
				{
					case "write":
					line = input.readLine();
					out.println(line);
					break;
					
					case "read":
					System.out.println(in.readLine());
					break;
					
					case "Exception":
						System.err.println(in.readLine());
						close = true;
					break;
					
					case "quitter":
						new Thread(new AccesServices()).start();
						close = true;
						break;
				}	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		this.client.close();
		this.in.close();
		this.out.close();
	}
}
