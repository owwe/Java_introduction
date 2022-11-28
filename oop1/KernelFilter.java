import java.awt.Color;
public class KernelFilter {
  

    public static Picture identity (Picture picture)
    {
        int[][] identity_kernel = new int[3][3];
        identity_kernel[1][1] = 1;


        return picture;
    }

    public static void main(String[] args)
    {
        Picture samuray = new Picture("samuray.png");
        //samuray.show();
        //System.out.print(samuray.get(4,4));
        Color color = new Color(255,0,0);
        int n = samuray.width();
        for (int i = 0; i < n; i++)
        {
            samuray.set(i,i,color);
            samuray.set(n - i - 1, i, color);

        }
        samuray.show();
    }
}
