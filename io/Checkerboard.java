public class Checkerboard {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0,n);
       
        double offset = 0.5;
        
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(j + offset, i + offset, offset);
                    //StdDraw.setPenColor(StdDraw.BLACK);
                    //StdDraw.filledCircle(j + offset, i + offset, offset);

                }
                else
                {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.filledSquare(j + offset, i + offset, offset);
                    //StdDraw.setPenColor(StdDraw.BLACK);
                    //StdDraw.filledCircle(j + offset, i + offset, offset);

                }
            }
        }
       
        
        
    }
}
