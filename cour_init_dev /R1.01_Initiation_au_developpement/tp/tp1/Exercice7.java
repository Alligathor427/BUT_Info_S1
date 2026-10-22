import java.util.Scanner;
public class Exercice7 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("distance en killometre");
        String s = mon_scanner.next();
        float distance = Float.valueOf(s); 
        System.out.println("temps en heure");      
        String s2 = mon_scanner.next();
        float temps = Float.valueOf(s2);
        System.out.println("la vittes est eguale a "+(distance/temps)+"KM/H");
    }
}
