
public class  DiscreteDistribution {
    public static void main(String[] args){
        
        int m = Integer.parseInt(args[0]);

        int n = args.length - 1;

        int sums[] = new int[n];

        int arr[] = new int[n];
        
        for (int i = 1; i < n+1; i++)
        {
            arr[i-1] = Integer.parseInt(args[i]);
        }
        for (int i = 0; i < n; i++)
        {
            if (i == 0)
                sums[0] = arr[0];
            else
                sums[i] = arr[i] + sums[i - 1];
        }

        for (int i = 0; i < m; i++)
        {
            double random = Math.random() * sums[n-1];
            random = Math.floor(random);
            
            for (int j = 0; j < n; j++)
            {
                if ((int)random <  sums[j])
                {
                    
                    System.out.print(j + 1 + " ");
                    break;

                }
            }
        }
        
            
    }
}
