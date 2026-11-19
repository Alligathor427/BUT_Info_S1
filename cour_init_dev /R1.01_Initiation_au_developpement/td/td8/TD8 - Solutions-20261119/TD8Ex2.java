import java.util.Scanner;

public class TD8Ex2 {
    public static final String header = "+---+---+---+---+---+---+---+---+---+---+";
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int offset;
        do {
            System.out.print("Entrez un nombre : ");
            offset = scanner.nextInt();
        } while(offset < 1 || offset > 10);
        int cell = 0;
        for (int i=0; i<10; ++i) {
            System.out.println(header);
            for (int j=0; j<10; ++j) {
                if (cell % offset == 0) {
                    System.out.print("| x ");
                } else {
                    System.out.print("|   ");
                }
                ++cell;
            }
            System.out.println("|");
        }
        System.out.println(header);
    }
}