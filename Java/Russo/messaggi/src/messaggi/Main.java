package messaggi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);
        String input = tastiera.nextLine();

        MessageManager server = new MessageManager();

        Sms sms = new Sms();
        Posta posta = new Posta();
        Email email = new Email();

        server.addListener(sms);
        server.addListener(email);
        server.addListener(posta);

        server.doAction(input);
    }
}
