import java.util.Scanner ; 
public class Exercice2{
    public static void main(String [] args ){ 
        Scanner mon_scanner = new Scanner(System.in); 
        System.out.println("entrée un nbr paire ");
        String s = mon_scanner.next();
        int nb = Integer.valueOf(s);
 
        while (nb%2!=0) {
            
            System.out.println("entrée un nbr paire ");
            String s2 = mon_scanner.next();
            nb = Integer.valueOf(s2);
        }
    }
}