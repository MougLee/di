package di.tweeter.v3;

import javax.inject.Inject;
import javax.ws.rs.client.Client;

//@Rest
public class RestMessanger implements Messanger
{
	@Inject
	private Client client;

	@Override
	public String send(String data)
	{
		if (client != null)
		{
			System.out.println("Client injected!");
		}
		// client.target("http://tweeter.com/tweets/post").request(MediaType.TEXT_PLAIN).post(Entity.json(data));
		return "Sending tweet via REST API.";
	}
}