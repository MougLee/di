package di.tweeter.v3;


@SMS
// @Alternative
public class SmsMessanger implements Messanger
{
	@Override
	public String send(String data)
	{
		return "Sending tweet via SMS.";
	}
}