package di.tweeter.v2;

import javax.ws.rs.client.ClientBuilder;

public class Main
{
	public static void main(String[] args)
	{
		RestMessanger restMessanger = new RestMessanger(ClientBuilder.newClient());
		TweeterApi api = new TweeterApi(restMessanger);
		Tweeter tweeter = new Tweeter(api);
		tweeter.tweet("Tweeting from better API via REST.");

		TweeterApi api_ = new TweeterApi(new SmsMessanger());
		Tweeter tweeter_ = new Tweeter(api_);
		tweeter_.tweet("Tweeting from better API via SMS.");
	}
}
