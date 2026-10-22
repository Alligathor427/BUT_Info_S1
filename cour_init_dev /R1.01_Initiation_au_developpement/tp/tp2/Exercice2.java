import java.util.Scanner;
public class Exercice2 {
    public static void main(String [] args) {



        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("sasire un nombre ");
        String s = mon_scanner.next();
        int nb = Integer.valueOf(s);


        if (nb%2==0) { 

            System.out.println("le chifr et paire ");

        } else { 
            System.out.println("le chifre est inpaire");
}
        


        
    }
}
