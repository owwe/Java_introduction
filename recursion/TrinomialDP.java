public class TrinomialDP {
    

    public static long trinomial(int n, int k)
    {
        n = (int) Math.abs(n);
        k = (int) Math.abs(k);
       long[][]trinomial = new long [n + 1][n + 1];
       trinomial [0][0] = 1;
       int col_number = 2;
       for (int i = 1;i <= n; i++)
       {
           for (int j = 0; j < col_number; j++)
           {
                if (j == 0 && j != col_number-1) 
                    trinomial[i][j] = trinomial[i - 1][j] + 2 * trinomial[i - 1][j+1];
                else if (j == col_number - 1)
                    trinomial[i][j] = 1;
                else 
                    trinomial[i][j] = trinomial[i - 1][j - 1] + trinomial[i - 1][j] + trinomial[i - 1][j + 1];
           }
           col_number++;
       }
       if (k > n)
       {
            return 0;
       }
        
       return trinomial[n][k];

    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
       

        StdOut.println(trinomial(n,k));
    }
}
