package di.tweeter.v2;

public class Tweeter
{
	private TweeterApi api;

	public Tweeter(TweeterApi api)
	{
		this.api = api;
	}

	public void tweet(String tweet)
	{
		api.postTweet("MaticBalantic", "Tweeting from bad API.");
	}
}