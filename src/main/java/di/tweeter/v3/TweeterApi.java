package di.tweeter.v3;

import javax.inject.Inject;

public class TweeterApi
{
	@Inject
	private Messanger messanger;

	// @SMS
	// @Inject
	// private Messanger smsMessanger;
	//
	// @Rest
	// @Inject
	// private Messanger restMessanger;

	public String postTweet(String user, String text)
	{
		return messanger.send(user + ": " + text);
	}
	//
	// public String postTweetSMS(String user, String text)
	// {
	// return smsMessanger.send(user + ": " + text);
	// }
	//
	// public String postTweetRest(String user, String text)
	// {
	// return restMessanger.send(user + ": " + text);
	// }
}
