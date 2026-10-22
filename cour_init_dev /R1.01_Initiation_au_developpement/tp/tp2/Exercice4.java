import java.util.Scanner ; 
public class Exercice4{
    public static void main(String [] args ){
        Scanner mon_scanner = new Scanner (System.in); 
        System.out.println("saisire un nombre  a ");
        String s = mon_scanner.next();
        float a = Float.valueOf(s);
        System.out.println("saisire un nombre b  ");
        String s1 = mon_scanner.next();
        float b  = Float.valueOf(s1);
        
        System.out.println("### a = " + a);
        System.out.println("### b = " + b);
        if (a==0 ) { 
            if (b==0){ 
                System.out.println("S=R");

            }else {
                System.out.println("S=null ");
            }
        }else{ 
            System.out.println("soltion ="+ (-(b/a )));

        }

    }
}