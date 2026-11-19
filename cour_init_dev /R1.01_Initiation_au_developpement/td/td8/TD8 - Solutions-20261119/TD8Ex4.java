import java.util.Random;
import java.util.Scanner;

public class TD8Ex4 {
    public static double [][] makeArray(int lines, int columns) {
        Random r= new Random();
        double doubleArray[][] = new double[lines][columns];
        for (int i=0; i<lines; ++i)
            for (int j=0; j<columns; ++j)
                doubleArray[i][j] = r.nextDouble() * 40.0 - 20.0;
        return doubleArray;
    }

    public static void display(double [][] t) {
        for (int i=0; i<t.length; ++i) {
            for (int j=0; j<t[i].length; ++j)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        int taille;
        do {
            System.out.print("Entrez la taille des tableaux (3 <= taille <= 15) : ");
            taille = scanner.nextInt();
        } while (taille < 3 || taille > 15);
        double [][] tab1 = makeArray(taille, taille);
        double [][] tab2 = makeArray(taille, taille);
        double [][] tab3 = new double[taille][taille];
        for (int i=0; i<taille; ++i) {
            for (int j=0; j<taille; ++j) {
                tab3[i][j] = 0;
                for (int k=0; k<taille; ++k) {
                    tab3[i][j] += tab1[i][k] * tab2[k][j];
                }
            }
        }
        System.out.println("Tab1 :");
        display(tab1);
        System.out.println("\nTab2 :");
        display(tab2);
        System.out.println("\nTab3 :");
        display(tab3);
    }
}