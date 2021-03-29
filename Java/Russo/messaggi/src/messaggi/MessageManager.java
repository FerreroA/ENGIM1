package messaggi;

import java.util.ArrayList;

public class MessageManager {

	private final ArrayList<MessageReceiver> notifications;

	public MessageManager() {
		notifications = new ArrayList<>();
	}

	public void addListener(MessageReceiver listener){
		notifications.add(listener);
	}

	private void notifyAllListeners( String messaggio){
		for (MessageReceiver listener : notifications) {
			listener.showMessage(messaggio);
		}
	}

	public void doAction(String messaggio){
		System.out.println("Hai ricevuto un messaggio:");
		notifyAllListeners(messaggio);
	}
}
