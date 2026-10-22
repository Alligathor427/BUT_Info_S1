import java.util.Scanner ; 
public class Exercice4{
    public static void main(String [] args ){ 
        Scanner mon_scanner = new Scanner(System.in); 

        int anée ; 

        System.out.println("entrée une valeur de base  ");
        String s = mon_scanner.next();
        int nb = Integer.valueOf(s);

        System.out.println("entrée valeur voulue  ");
        String s1 = mon_scanner.next();
        int valeur_voulue = Integer.valueOf(s);

        System.out.println("entrée % interet  ");
        String s2 = mon_scanner.next();
        int interet = Integer.valueOf(s); 

 
        do {
            nb=nb+(nb*interet); 

        } while (nb>valeur_voulue); 
        System.out.println(nb );
    }
}
