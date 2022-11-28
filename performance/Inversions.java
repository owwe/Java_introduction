public class Inversions
{
    public static long count (int[] a)
    {
        long c = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[i])
                    c++;
            }
        }
        return c;
    }

    public static void print (int[] a)
    {
        for (int i = 0; i < a.length; i++) StdOut.print(a[i] + " ");
        StdOut.println();
    }
    
    public static int[] generate(int n, long k)
    {
        int[] arr = new int[n];
       
        long count = 0;
        int offset = 0;
        int subset_len = n;
        for (int i = 0; i < n; i++)
        {
            if ( k >= subset_len)
            {
                arr[i] = n - i - 1;
                k -= (subset_len - 1);
                subset_len --;
                offset ++;
            }
            else
            {
                arr[i] = (i - offset );
            }

        }
        if (k > 0)
        {

            for (int i = 0; i < k; i++)
            {
                int temp = arr[n - i - 1];
                arr[n - i - 1] = arr[n - i - 2];
                arr[ n - i - 2] = temp;
                n--;
            }
        }
       

        
        
        return arr;
    }
    
    public static void main (String[] args)
    {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n,k);
        print(a);
    }
}