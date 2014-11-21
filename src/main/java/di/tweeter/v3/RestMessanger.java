package di.tweeter.v3;

@Rest
public class RestMessanger implements Messanger
{
	// @Inject
	// private Client client;

	@Override
	public String send(String data)
	{
		// client.target("http://tweeter.com/tweets/post").request(MediaType.TEXT_PLAIN).post(Entity.json(data));
		return "Sending tweet via REST API.";
	}
}