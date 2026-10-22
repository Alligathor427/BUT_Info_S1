import java.util.Scanner;
public class Exercice4 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        String s = mon_scanner.next();
        float nb = Float.valueOf(s);
        Scanner mon_scanner2 = new Scanner(System.in);
        String s2 = mon_scanner2.next();
        float nb2 = Float.valueOf(s2);

        System.out.println( " ton resultat est  " +(nb/nb2));
    }
}
