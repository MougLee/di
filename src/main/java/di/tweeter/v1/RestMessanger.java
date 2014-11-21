package di.tweeter.v1;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class RestMessanger implements Messanger
{
	@Override
	public void send(String data)
	{
		Client client = ClientBuilder.newClient();
		client.target("http://tweeter.com/tweets/post").request(MediaType.TEXT_PLAIN).post(Entity.json(data));
	}

}