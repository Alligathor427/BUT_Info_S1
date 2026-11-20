import java.awt.Color;

public class exercice2 {

    public static void main(String[] args) {
        // 1. Sol / pelouse (ellipse verte)
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledEllipse(0.5, 0.11, 0.47, 0.11);

        // 2. Jambes (deux rectangles bleus)
        StdDraw.setPenColor(Color.BLUE);
        // halfWidth = 0.035 (largeur totale = 0.07), halfHeight = 0.19 (hauteur totale = 0.38)
        // Centre y = 0.27 -> va de y = 0.08 à y = 0.46
        StdDraw.filledRectangle(0.45, 0.27, 0.035, 0.19);
        StdDraw.filledRectangle(0.55, 0.27, 0.035, 0.19);

        // 3. Buste (rectangle noir)
        StdDraw.setPenColor(Color.BLACK);
        // halfWidth = 0.14 (largeur totale = 0.28), halfHeight = 0.155 (hauteur totale = 0.31)
        // Centre y = 0.615 -> va de y = 0.46 à y = 0.77
        StdDraw.filledRectangle(0.5, 0.615, 0.14, 0.155);

        // 4. Tête (cercle rouge foncé / bordeaux)
        StdDraw.setPenColor(new Color(128, 0, 0));
        // rayon = 0.11 -> centre y = 0.88 (va de y = 0.77 à y = 0.99)
        StdDraw.filledCircle(0.5, 0.88, 0.11);
    }
}