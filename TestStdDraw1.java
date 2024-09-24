public class TestStdDraw1 {
       public static void main(String[] args) {
         double[] arrX = {0.5,0.65,0.5,0.35};
         double[] arrY = {0.25,0.5,0.75,0.5};
         StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
         StdDraw.filledPolygon(arrX,arrY);
         StdDraw.filledPolygon(arrY,arrX);
         StdDraw.setPenColor(StdDraw.BLACK);
         StdDraw.polygon(arrX,arrY);
         StdDraw.polygon(arrY,arrX);
         /*StdDraw.filledCircle(0.5,0.5,0.15);
         StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
         StdDraw.filledCircle(0.5,0.5,0.1);*/
         StdDraw.setPenColor(StdDraw.BOOK_RED);
         StdDraw.filledCircle(0.5,0.5,0.05);
         StdDraw.setPenColor(StdDraw.WHITE);
         StdDraw.setPenRadius(0.01);
         StdDraw.circle(0.5,0.5,0.05);
       }
   }
