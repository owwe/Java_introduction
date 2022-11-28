public class RandomWalkers {
    public static void main(String[] args){

        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double avg = 0;
        
        for (int i = 0; i < trials; i++){

            int x = 0, y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r){

                double prob = Math.random();

                if (prob <= 0.25)
                    x++;
                else if (prob > 0.25 && prob <= 0.5)
                    x--;
                else if (prob > 0.5 && prob <= 0.75)
                    y++;
                else
                    y--;
                
                steps++;
                
            }
            avg += steps;
           
        }
        avg /= trials;
        System.out.println("average number of steps = "+ avg);
    }
}
