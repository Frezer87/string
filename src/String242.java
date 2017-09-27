
import sun.awt.SunHints;
public class String242 {
    public static void main(String [] args) {
        StringBuilder A = new StringBuilder();
        System.out.println(A.capacity());
        A.append("Frezer");

        System.out.println(A.capacity());
        A.append("Hi Frezer, How are you?");
        System.out.println(A.capacity());
        System.out.println();

        StringBuilder B= new StringBuilder();
        System.out.println("B = " + B);
        System.out.println("length = " + B.length());

        B.append("Frezer");
        System.out.println("B = " + B);
        System.out.println("length = " +B.length());
        System.out.println();

        StringBuilder C= new StringBuilder("Hi Kidane how are you?");
        System.out.println(C);
        C = C.replace(3,9,"Frezer");
        System.out.println(C);
        System.out.println();

        StringBuilder D= new StringBuilder("Hi ");
        System.out.println(D);
        D.append("Frezer");
        System.out.println(D);


    }
}

