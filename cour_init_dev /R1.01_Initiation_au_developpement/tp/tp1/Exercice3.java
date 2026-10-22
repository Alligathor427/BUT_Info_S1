import java.util.Scanner;
public class Exercice3 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        String s = mon_scanner.next();
        int nb = Integer.valueOf(s);
        System.out.println( " ton nombre  au carééest " +(nb*nb));
    }
}
