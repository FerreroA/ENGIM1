package messaggi;

public class Sms implements MessageReceiver {

	@Override
	public void showMessage( String messaggio) {
		System.out.println("Sms: " + messaggio);
	}
}
