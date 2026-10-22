import java.util.Scanner;
public class Exercice3 {
    public static void main(String [] args) {



        Scanner mon_scanner = new Scanner(System.in);
        System.out.println("sasire un nombre ");
        String s = mon_scanner.next();
        int nb = Integer.valueOf(s);


        if (nb%4==0) { 
            if (nb%100==0){
                if (nb%400==0){
                    System.out.println("l'anée est bisextile ");

                }else {
                    System.out.println("l'anée n'est pas bisextile ");
                }
            }

        }else {
            System.out.println("l'anée n'est pas bisextile");
        }
        

        


        
    }
}
