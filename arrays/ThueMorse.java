public class ThueMorse {
    public static void main(String[] args){

        double n = Double.parseDouble(args[0]);

        double steps = Math.log(n) / Math.log(2);
        steps = Math.ceil(steps);

        boolean[] morse  = new boolean[ (int)Math.pow(2 , steps)];

        for (int i = 0; i <= steps ; i++)
        {
            if (i == 0)
                ;
            else
            {
                int middle = (int)Math.pow(2 , i - 1);
                for (int j = 0; j < middle; j++)
                {
                    morse[middle + j] = !morse[j];  
                }
            }   
        }
        //for (int i = 0; i < morse.length; i ++) System.out.println(morse[i]);
        //Checking the thue mors array
    
        for (int i = 0; i < n; i ++)
        {
            for (int j = 0; j < n; j ++)
            {

                if (j == 0)
                {
                    if ( morse[i] == morse[j])
                    {
                        System.out.print("+ ");
                    }
                    else
                    {
                        System.out.print("- ");
                    }
                }
                else if (j == n-1)
                {
                    if ( morse[i] == morse[j])
                    {
                        System.out.print(" +");
                    }
                    else
                    {
                        System.out.print(" -");
                    }
                }
                else
                {
                    if ( morse[i] == morse[j])
                    {
                        System.out.print(" + ");
                    }
                    else
                    {
                        System.out.print(" - ");
                    }

                }
            }
            System.out.println();
        }
    }
}
