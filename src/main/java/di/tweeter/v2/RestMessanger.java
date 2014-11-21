package di.tweeter.v2;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class RestMessanger implements Messanger
{
	private Client client;

	public RestMessanger(Client client)
	{
		this.client = client;
	}

	@Override
	public void send(String data)
	{
		client.target("http://tweeter.com/tweets/post").request(MediaType.TEXT_PLAIN).post(Entity.json(data));
	}
}