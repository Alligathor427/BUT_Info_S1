import java.awt.*;

public class TP12 {
    static int annee = 1970;
    static int mois = 1;
    static int jour = 1;

    public static void main(String[] args) {
        if (args.length > 0) {
            demnde_de_la_date(args[0]);
        }
        System.out.println(annee +"-"+  mois + "-"+ jour  );


        // programe affichage de la grille
        // liste de tout les cases

        int[][] liste_cases = new int[35][2];
        int index = 0;

        for (int i = 5; i <= 65; i += 10) {
            for (int y = 5; y <= 45; y += 10) {
                liste_cases[index][0] = i;
                liste_cases[index][1] = y;

                System.out.println(liste_cases[index][0] + " , " + liste_cases[index][1]);
                index += 1;
            }
        }

        // mise en places des cases

        StdDraw.setScale(0.0, 70.0);

        for (int iter= 0 ; iter < 35 ; iter++ ){
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledRectangle(liste_cases[iter][0], liste_cases[iter][1], 4.3, 4.3);
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.filledRectangle(liste_cases[iter][0], liste_cases[iter][1], 4, 4 );
        }








        StdDraw.show();




    }

    public static void demnde_de_la_date(String date) {
        String[] ymd = date.trim().split("-");
        annee = Integer.valueOf(ymd[0]);
        mois = Integer.valueOf(ymd[1]);
        jour = Integer.valueOf(ymd[2]);
    }




}