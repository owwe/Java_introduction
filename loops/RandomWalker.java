public class RandomWalker {
    public static void main(String[] args){

        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int steps = 0;
        System.out.println("(" + x + ", " + y + ')');
        while (Math.abs(x) + Math.abs(y) < r){
            
            double prob = Math.random();

            if (prob <= 0.25)
                x++;
            else if (prob > 0.25 && prob <= 0.5)
                x--;
            else if (prob > 0.5 && prob <= 0.75)
                y++;
            else if (prob > 0.75 && prob <= 1)
                y--;
            else
                ;
            
            steps++;
            System.out.println("(" + x + ", " + y + ')');
        }
        System.out.println("steps = " + steps);

    }
}
