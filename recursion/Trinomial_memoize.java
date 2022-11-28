public class Trinomial_memoize {
    
        public static long[][] n_k = new long[10][10];
    
        public static long trinomial(int n, int k)
        {
            if (k < -n || k > n) return 0;
            else if (n == 0 && k == 0) return 1;
            if(n_k[n][(int) Math.abs(k)] == 0) 
                n_k[n][(int) Math.abs(k)] = (trinomial(n-1, k-1) + trinomial(n-1, k) + trinomial(n-1, k+1));
            return n_k[n][(int) Math.abs(k)];
        }
      
        public static void main(String[] args)
        {
            int n = Integer.parseInt(args[0]);
            int k = Integer.parseInt(args[1]);
            int offset = (int) Math.abs(k-n);
            n_k = new long[1 + n + offset][k + offset + 1];
            
            StdOut.print(trinomial(n, k));
    
        }
    
    
    
}
