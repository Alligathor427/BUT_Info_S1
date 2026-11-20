import java.awt.*;

public class exercice1_2 {
    public static void main(String [] args) {
        StdDraw.show();
        StdDraw.setScale(0.0, 40.0);
        // 3. Buste (rectangle noir)
        StdDraw.setPenColor(Color.BLACK);
        // halfWidth = 0.14 (largeur totale = 0.28), halfHeight = 0.155 (hauteur totale = 0.31)
        // Centre y = 0.615 -> va de y = 0.46 à y = 0.77
        StdDraw.filledRectangle(20, 30, 20, 10);
        StdDraw.setPenColor(Color.RED);
        StdDraw.filledRectangle(10, 10, 4, 5);
        StdDraw.setPenColor(Color.GREEN);
        StdDraw.filledRectangle(20, 10, 4, 5);
        StdDraw.setPenColor(Color.BLUE);
        StdDraw.filledRectangle(30, 10, 4, 5);

        while(true) {
            if (StdDraw.mousePressed()) {
                System.out.println("Mouse x:" + StdDraw.mouseX() + ", y: " + StdDraw.mouseY());
                if (StdDraw.mouseX()<=14  && StdDraw.mouseX()>=6   &&  StdDraw.mouseY()<=15 && StdDraw.mouseY()>=5 ){
                    StdDraw.setPenColor(Color.RED);
                    StdDraw.filledRectangle(20, 30, 20, 10);
                }
                if (StdDraw.mouseX()<=24  && StdDraw.mouseX()>=16   &&  StdDraw.mouseY()<=15 && StdDraw.mouseY()>=5 ){
                    StdDraw.setPenColor(Color.GREEN);
                    StdDraw.filledRectangle(20, 30, 20, 10);
                }
                if (StdDraw.mouseX()<=34  && StdDraw.mouseX()>=26   &&  StdDraw.mouseY()<=15 && StdDraw.mouseY()>=5 ){
                    StdDraw.setPenColor(Color.BLUE);
                    StdDraw.filledRectangle(20, 30, 20, 10);

                }

            }
        }
    }
}