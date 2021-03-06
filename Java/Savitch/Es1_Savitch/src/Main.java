import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("Inserisci il tuo anno di nascita:");
        int birthDate = tastiera.nextInt();
        System.out.println("Inserisci l'età di riferimento:");
        int years = tastiera.nextInt();;

        int ret = birthDate + years;


        if (ret >= 2021)
            System.out.println("Compirai " + years + " anni nel " + ret);
        else
            System.out.println("Hai compiuto " + years + "anni nel " + ret);

    }
}
