package di.tweeter.v1;

public class TweeterApi
{
	public void postTweet(String user, String text)
	{
		RestMessanger messanger = new RestMessanger();
		messanger.send(user + ": " + text);
	}
}