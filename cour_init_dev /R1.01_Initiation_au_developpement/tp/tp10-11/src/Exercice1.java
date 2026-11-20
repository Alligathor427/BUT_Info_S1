public class Exercice1 {
    public static void main(String[] args) {
        // Couleur du trait en noir (optionnel car noir par défaut)
        StdDraw.setPenColor(StdDraw.BLACK);

        // 1. Carré et cercle inscrits en bas à gauche
        double x1 = 0.275;
        double y1 = 0.275;
        double demiCote = 0.225;

        StdDraw.square(x1, y1, demiCote);
        StdDraw.circle(x1, y1, demiCote);

        // 2. Rectangle et ellipse inscrits en haut à droite
        double x2 = 0.725;
        double y2 = 0.725;
        double demiLargeur = 0.225;
        double demiHauteur = 0.175;

        StdDraw.rectangle(x2, y2, demiLargeur, demiHauteur);
        StdDraw.ellipse(x2, y2, demiLargeur, demiHauteur);
    }
}