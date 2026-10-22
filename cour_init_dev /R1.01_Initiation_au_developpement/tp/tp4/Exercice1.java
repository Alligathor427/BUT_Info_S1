import java.util.Scanner ; 
public class Exercice1{
    public static void main(String [] args ){
        Scanner monScanner = new Scanner(System.in);
        String nom="";
        int nb=0 ; 
        while ((nom.equals("Quiter")) == false ) {
            System.out.println("entrée un noms ");
            nom=monScanner.next(); 
            nb+=1;
        }
        nb-=1 ;
        System.out.println("Vous avez saisi " + nb + " noms.");
    
}

}
