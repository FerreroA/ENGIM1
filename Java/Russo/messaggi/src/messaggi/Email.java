package messaggi;

public class Email implements MessageReceiver {

	@Override
	public void showMessage( String messaggio) {
		System.out.println("Email: " + messaggio);
	}
}
