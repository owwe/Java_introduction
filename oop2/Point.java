public class Point {
    
    private final double x1;
    private final double y1;

    public Point (double x, double y)
    {
        x1 = x;
        y1 = y;
    }
    public double distanceTo (Point q)
    {
        double delta_x = Math.pow(q.x1 - this.x1, 2);
        double delta_y = Math.pow(q.y1 - this.y1, 2);
        return Math.sqrt(delta_x + delta_y);
    }
    public String toString()
    {
        return ("(" + x1 + " " + y1 + ")");
    }
    public static void main(String[] args)
    {
        Point a = new Point(0,0);
        Point b = new Point(3,4);
        System.out.println(a.distanceTo(b));
        System.out.println(a);
    }
}
