import java.util.Scanner;

public class TD8Ex1 {
  public static void main(String [] args) {
    String [] noms;
    String [] prenoms;
    int [] ages;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Entrez le nombre de personnes à saisir : ");
    int nbPersonnes = scanner.nextInt();
    noms = new String[nbPersonnes];
    prenoms = new String[nbPersonnes];
    ages = new int[nbPersonnes];
    for (int i=0; i<nbPersonnes; ++i) {
      System.out.print("[Personne " + i + "] Entrez le nom : ");
      noms[i] = scanner.next();
      System.out.print("[Personne " + i + "] Entrez le prénom : ");
      prenoms[i] = scanner.next();
      System.out.print("[Personne " + i + "] Entrez l'âge : ");
      ages[i] = scanner.nextInt();
    }
    System.out.println("Vous avez saisi " + nbPersonnes + " personnes :");
    for (int i=0; i<nbPersonnes; ++i) {
      System.out.println(noms[i]  + " " + prenoms[i] + ", " + ages[i] + " ans");
    }
  }
}
