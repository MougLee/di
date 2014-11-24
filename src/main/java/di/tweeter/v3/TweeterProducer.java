package di.tweeter.v3;

import javax.enterprise.inject.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class TweeterProducer
{
	@Produces
	public Client getRestClient()
	{
		return ClientBuilder.newClient();
	}
}