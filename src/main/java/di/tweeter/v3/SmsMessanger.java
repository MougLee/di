package di.tweeter.v3;

import javax.enterprise.inject.Alternative;

//@SMS
@Alternative
public class SmsMessanger implements Messanger
{
	@Override
	public String send(String data)
	{
		return "Sending tweet via SMS.";
	}
}