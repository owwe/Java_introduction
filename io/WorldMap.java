public class WorldMap 
{
    public static void main (String[] args)
    {
        int width = StdIn.readInt();
        int height = StdIn.readInt();
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0,width);
        StdDraw.setYscale(0,height);
        while(StdIn.hasNextLine())
        {
            if (!StdIn.isEmpty())
            {
                String s = StdIn.readString();
                // StdOut.println(s);
                int n = StdIn.readInt();
                double[] x = new double[n];
                double[] y = new double[n];
                for (int i = 0; i < n; i++)
                {
                    double xi = StdIn.readDouble();
                    double yi = StdIn.readDouble();
                    x[i] = xi;
                    y[i] = yi;
                }
                StdDraw.polygon(x,y);
            }
            else
                break;
           
        }

      


    }
}
