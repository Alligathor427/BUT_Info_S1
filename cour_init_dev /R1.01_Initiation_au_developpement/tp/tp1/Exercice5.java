import java.util.Scanner;
public class Exercice5 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        String s = mon_scanner.next();
        float nb = Float.valueOf(s);
        System.out.println( "ton nombre en Killometre est " +(nb/1000)+" et ton nombre en milimetre est " +(nb*1000));
    }
}
