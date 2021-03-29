public class Main {

    public static void main(String[] args) {

        A obj1 = new A(1, 2);
        System.out.println(obj1.metodo2());

        A obj2 = new B(3);
        System.out.println(obj2.metodo2());
//        System.out.println(obj2.metodo2(2));

        B obj3 = new B(3);
        System.out.println(obj3.metodo2());
        System.out.println(obj3.metodo2(3));

        A obj4 = new C(3);
        if (obj4.metodo2() % 2 == 0)
            System.out.println("Ciao");

        if (new E(5).metodo1())
            System.out.println("Da");
        else
            System.out.println("Java");

        D obj5 = new B(3);
//        D obj6 = new D(3);
        D obj7 = new E(7);

        while(obj5.metodo1()){
            System.out.println("Ciao!");
            ((A)obj5).metodoMeno();
        }
    }
}
