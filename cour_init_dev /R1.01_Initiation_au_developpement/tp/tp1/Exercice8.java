import java.util.Scanner;
public class Exercice8 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("vittes du train en km/h");
        String s = mon_scanner.next();
        float vittes = Float.valueOf(s); 
        System.out.println("distance restante en killometre");      
        String s2 = mon_scanner.next();
        float distance = Float.valueOf(s2);
        System.out.println("il reste "+(distance/vittes)+"H");
    }
}
