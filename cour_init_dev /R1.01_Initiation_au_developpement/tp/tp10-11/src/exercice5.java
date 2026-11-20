import java.awt.Color;

public class exercice5 {

    public static void main(String[] args) {
        String gcode = """
        S0
        G0 1.0 1.0
        S1000
        G1 2.0 1.0
        G1 2.0 2.0
        G1 1.0 2.0
        G1 1.0 1.0
        S0
        G0 3.0 3.0
        S1000
        G1 13.0 3.0
        G1 13.0 13.0
        G1 3.0 13.0
        G1 3.0 3.0
        """;

        // Zone de travail : 40 x 40 cm = 400 x 400 mm (coordonnées G0/G1 en mm)
        StdDraw.setScale(0.0, 40.0);

        double xCourant = 0.0;
        double yCourant = 0.0;

        // Découpage sur les espaces et retours à la ligne
        String[] tokens = gcode.trim().split("[ \n]+");

        int i = 0;
        while (i < tokens.length) {
            String cmd = tokens[i];

            if (cmd.equals("S0")) {
                StdDraw.setPenRadius(0.002);
                i += 1;
            } else if (cmd.equals("S1000")) {
                StdDraw.setPenRadius(0.005);
                i += 1;
            } else if (cmd.equals("G0")) {
                double xCible = Double.parseDouble(tokens[i + 1]);
                double yCible = Double.parseDouble(tokens[i + 2]);
                StdDraw.setPenColor(new Color(255, 255, 0));
                StdDraw.line(xCourant, yCourant, xCible, yCible);
                xCourant = xCible;
                yCourant = yCible;
                i += 3;
            } else if (cmd.equals("G1")) {
                double xCible = Double.parseDouble(tokens[i + 1]);
                double yCible = Double.parseDouble(tokens[i + 2]);
                StdDraw.setPenColor(new Color(0, 0, 0));
                StdDraw.line(xCourant, yCourant, xCible, yCible);
                xCourant = xCible;
                yCourant = yCible;
                i += 3;
            } else {
                i += 1;
            }
        }
    }
}