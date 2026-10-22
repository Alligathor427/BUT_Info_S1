import java.util.Scanner;
public class Exercice6 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        String s = mon_scanner.next();
        float nb = Float.valueOf(s);
        System.out.println( "ton prix avec la tva est " +(nb*1.2));
    }
}
