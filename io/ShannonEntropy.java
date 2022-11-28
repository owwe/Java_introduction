public class ShannonEntropy
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        double sum = 0;
        int[] list = new int[m+1];
        int counter = 0;
        while (!StdIn.isEmpty())
        {
            int element = StdIn.readInt();
            //StdOut.println(element);
            list[element]++;
            counter++;
        }
        for (int i = 1; i <= m; i++)
        {
            double x = (double)list[i];
            //StdOut.println("count ="+x);
            double p = x / counter;
            //StdOut.println("Probability is "+p);
            double log_p = (Math.log(p) / Math.log(2));
            //StdOut.println("log p is " + log_p);

            if (p == 0.0) 
                log_p = 0;
            
            sum += (p * log_p);
        }
        sum *= -1;
        StdOut.printf("%.4f",sum);
    }
}