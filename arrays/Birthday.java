public class Birthday {
    public static void main(String[] args){

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        

        int[] value_counts = new int[n];
        for (int i = 0; i < trials; i++)
        {
            boolean[] days = new boolean[n];
            int first = (int)Math.round(Math.random() * (n-1));
            days[first] = true;

            for (int j = 1; j < n; j++)
            {
                int day = (int)Math.round(Math.random() * (n-1));

                if (!days[day])
                {
                    days[day] = true;
                }
                else
                {
                    value_counts[j]++;
                    break;
                }
            }
        }

        double[] sums = new double[n];

        sums[0] = value_counts[0];
        for (int i = 1; i < n; i++)
        {
            sums[i] = sums[ i-1 ] + value_counts[i];
        }

        for (int i = 0; i < n; i++)
        {
            sums[i] /= trials;
        }
        
        //System.out.println("i" + "     " + "count" + "     " + "fraction");
   

        for (int i = 0; i < n; i++)
        {
            if( sums[i] >= 0.50)
            {
                System.out.println(i+1 +  " " + value_counts[i] + " " + sums[i]);
                break;
            }
            else
            {
                System.out.println(i+1 +  " " + value_counts[i] + " " + sums[i]);
            }
        }
        


    }
    
}
