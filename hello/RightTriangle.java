public class RightTriangle {
    public static void main(String[] args) {
    
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean positive = x > 0 && y > 0 && z > 0;

        int max = Math.max(x,y);
        max = Math.max(max,z);

        boolean check = x * x + y * y == max * max ||  z * z + y * y == max * max || x * x + z * z == max * max;

        boolean result = check && positive;

        System.out.println(result);
        






    }
 }