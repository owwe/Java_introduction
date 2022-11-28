public class RecursiveSquares {

    public static void drawSquare(double x, double y, double length)
    {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length);
    }
    public static void draw(int n, double x, double y, double length)
    { 
        if (n == 0) return;
        else 
        {
            length /= 2;
            draw(n-1, x - length, y + length, length);
            draw(n-1, x + length, y + length, length);
            drawSquare(x, y, length);
            draw(n-1, x - length, y - length, length);
            draw(n-1, x + length, y - length, length);
        }
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        draw(n, 0.5, 0.5, 0.5);
        //StdDraw.line(0,0,1,1);
    }
}
