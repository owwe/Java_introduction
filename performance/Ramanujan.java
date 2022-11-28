public class Ramanujan {
    public static boolean isRamanujan(long x)
    {
        double n = x;
        int counter = 0;
        double ceil =  Math.round(Math.pow(n, 1/3.0));
        for (int i = 1; i <= ceil + 1; i++)
        {
            double b =  Math.round(Math.pow((n - Math.pow(i, 3)), 1 / 3.0));
            if (Math.pow(i,3) + Math.pow(b, 3) == n) 
            {
                
                //StdOut.println(i + " " + (int) b );
                if (counter == 2)
                    return true;
            
                counter++;
            }
        }
        
    return false;
    }
    public static void main(String[] args)
    {
        long n = Long.parseLong(args[0]);
        StdOut.println(isRamanujan(n));
    }
}
