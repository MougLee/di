package di.tweeter.v3;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Tweeter
{
	@Inject
	private TweeterApi api;

	private String user;

	public void setUser(String user)
	{
		this.user = user;
	}

	public String tweet(String tweet)
	{
		return api.postTweet(user, tweet);

		// return api.postTweetSMS(user, tweet);
		// return api.postTweetRest(user, tweet);
	}
}