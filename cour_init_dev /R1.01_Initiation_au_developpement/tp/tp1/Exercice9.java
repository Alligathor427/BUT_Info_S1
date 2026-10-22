import java.util.Scanner;
public class Exercice9 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);


        System.out.println("temps en heures");
        String s = mon_scanner.next();
        float H = Float.valueOf(s); 


        System.out.println("temps en minutes");      
        String s2 = mon_scanner.next();
        float M = Float.valueOf(s2);

        System.out.println("temps en secoondes");      
        String s3 = mon_scanner.next();
        float S = Float.valueOf(s3);

        System.out.println("le temps est de "+((H*3600)+(M*60)+(S))+"secondes");
    }
}
