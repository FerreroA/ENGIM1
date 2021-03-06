import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il primo valore:");
        int a = tastiera.nextInt();
        System.out.println("Inserisci il secondo valore:");
        int b = tastiera.nextInt();

        System.out.println("Gli interi dell'intervallo scelto sono: ");
        for (int i = a; i <= b; i++)
            System.out.println(i);


    }
}
