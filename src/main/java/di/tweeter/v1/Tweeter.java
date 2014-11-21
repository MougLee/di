package di.tweeter.v1;

public class Tweeter
{
	private String user;

	public Tweeter(String user)
	{
		this.user = user;
	}

	public void tweet(String tweet)
	{
		TweeterApi api = new TweeterApi();
		api.postTweet(user, tweet);
	}
}