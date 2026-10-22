import java.util.Scanner;
public class Exercice10 {
    public static void main(String [] args) {
        Scanner mon_scanner = new Scanner(System.in);


        System.out.println("temps en secondes");
        String s = mon_scanner.next();
        float H = Float.valueOf(s); 


        System.out.println("le temps est de "+(H%3600)+" heures " + ((H-(H%3600))%60) +" minutes "+(H-((H-(H%3600))%60)) +" secondes " );
    }
}