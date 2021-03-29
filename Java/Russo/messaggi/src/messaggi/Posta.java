package messaggi;

public class Posta implements MessageReceiver {

	@Override
	public void showMessage( String messaggio) {
		System.out.println("Posta: " + messaggio);
	}
}
