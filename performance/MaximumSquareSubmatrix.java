public class MaximumSquareSubmatrix {
    public static int size(int[][] a)
    {
        int max_row = 0;
        int max_column = 0;
        int n = a.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (a[i][j] == 1)
                {
                    for (int c = 0; c < n - i; c++)
                    {
                        for(int d = 0; d < n - j; d++)
                        {
                            if( a[i+c][j+d] == 0)
                            {
                                max_column = j + d;
                                max_row = i + c;
                            
                                break;
                            }
                        }
                    }
                }
            }
        }
        return Math.min(max_row, max_column);
    }
    public static int[][] get_matrix()
    {
        int n = StdIn.readInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = StdIn.readInt();
            }
        }
        return arr;
    }
    public static void print(int[][]a)
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                StdOut.print(a[i][j]+ " ");
            }
            StdOut.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = get_matrix();
        StdOut.print(size(arr));
        //StdOut.println();
        //print(arr);
    }
}
