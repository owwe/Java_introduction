
public class Minesweeper {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);


        boolean[][] mines = new boolean[m][n];

        int [][] grid = new int[m][n];
        while (k > 0)
        {
            int a = (int) (Math.random() * m);
            int b = (int) (Math.random() * n);
            if (!mines[a][b])
            {
                k--;
                mines[a][b] = true;   
            }
        }
/*
/// For testing purposes
        for(int i = 0; i < m; i++)
        {
            int temp  = 0;
            for (int j = 0; j < n; j++)
            {
                
            
                if (mines[i][j]) 
                    temp = 1;
                else 
                    temp = 0;
                System.out.print (temp + " ");
            }
            System.out.println ();
        }
/// @@@@@@@@@@@@@@@@@@@@@@@@@@@@
*/

        if (m == 1)
        {
            for(int j = 0; j < n; j++)
            {
                if ( !mines[m - 1][j])
                {
                    if (j == 0)
                    {
                        if (mines[0][1])
                            grid[0][j] = 1;
                        
                    }
                    else if (j == n - 1)
                    {
                        if(mines[0][n-2])
                            grid[0][j] = 1;
                    }
                    else
                    {
                        int counter = 0;
                        for (int a = -1; a <= 1; a++)
                        {
                            if(mines[0][j+a])
                                counter++;
                        }
                        grid[0][j] += counter;
                    }
                }
                else
                {
                    grid[m-1][j] = -1;
                }
            }
        }
        else if (n == 1)
        {
            for(int j = 0; j < m; j++)
            {
                if ( !mines[j][0])
                {
                    if (j == 0)
                    {
                        if (mines[1][0])
                            grid[0][0] = 1;
                        
                    }
                    else if (j == m - 1)
                    {
                        if(mines[m-2][0])
                            grid[m-1][0] = 1;
                    }
                    else
                    {
                        int counter = 0;
                        for (int a = -1; a <= 1; a++)
                        {
                            if(mines[j+a][0])
                                counter++;
                        }
                        grid[j][0] += counter;
                    }
                }
                else
                {
                    grid[j][0] = -1;
                }
            }
        }
        else
        {

        
  
            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (!mines[i][j])
                    {
                        if (i == 0 && j == 0 )
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                
                                for (int b =0; b < 2; b++)
                                {
                                    if (mines[i+a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (i == 0 && j == n-1 )
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                for (int b = 0; b < 2; b++)
                                {
                                    if (mines[i+a][j-b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (i == m-1 && j == 0 )
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                
                                for (int b =0; b < 2; b++)
                                {
                                    if (mines[i-a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (i == m-1 && j == n-1 )
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                
                                for (int b =0; b < 2; b++)
                                {
                                    if (mines[i-a][j-b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if ( j == 0)
                        {
                            int counter = 0;
                            for (int a = -1; a <= 1; a++)
                            {
                                
                                for (int b =0; b < 2; b++)
                                {
                                    if (mines[i+a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (i == 0 )
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                
                                for (int b =-1; b <= 1; b++)
                                {
                                    if (mines[i+a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (i == m-1)
                        {
                            int counter = 0;
                            for (int a = 0; a < 2; a++)
                            {
                                
                                for (int b =-1; b <= 1; b++)
                                {
                                    if (mines[i-a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if (j == n-1 )
                        {
                            int counter = 0;
                            for (int a = -1; a <= 1; a++)
                            {
                                
                                for (int b =0; b < 2; b++)
                                {
                                    if (mines[i+a][j-b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                        else if ( i > 0 && j >  0 && i < m-1 && j < n-1)
                        {
                            int counter = 0;
                            for (int a = -1; a <= 1; a++)
                            {
                                
                                for (int b = -1; b <= 1; b++)
                                {
                                    if (mines[i+a][j+b])
                                        counter++;
                                }
                            }
                            grid[i][j] = counter;
                        }
                    }
                    else 
                        grid[i][j] = -1;
                    
                }
            }
        }
        

/*   
/// For testing purposes
    for(int i = 0; i < m; i++)
    {
        int temp  = 0;
        for (int j = 0; j < n; j++)
        {
            System.out.print (grid[i][j] + " ");
        }
        System.out.println ();
    }
/// @@@@@@@@@@@@@@@@@@@@@@@@@@@@
*/
    for(int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (grid[i][j] == -1)
                System.out.print(" * ");
            else 
                System.out.print(" " + grid[i][j] +  " ");
        }
        System.out.println();  
    }
    //System.out.println("Program finished");
    
    }
}
