package di.tweeter.v2;

public class TweeterApi
{
	private final Messanger messanger;

	public TweeterApi(Messanger messanger)
	{
		this.messanger = messanger;
	}

	public void postTweet(String user, String text)
	{
		messanger.send(user + ": " + text);
	}
}