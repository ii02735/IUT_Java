package service;

import java.net.Socket;

public abstract class Service implements Runnable{
	
	private Socket client;
	public Service (Socket client)
	{
		this.client = client;
	}
	@Override
	public abstract void run();
	
	public void setClient(Socket client)
	{
		this.client = client;
	}
	
	public Socket getClient()
	{
		return this.client;
	}
}
