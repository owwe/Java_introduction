public class GreatCircle {
    public static void main(String[] args) {
    
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
       
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double r = 6371;
        
        double sin1 = Math.pow(Math.sin(Math.toRadians((x2 - x1) / 2.0)),2);
        double sin2 = Math.pow(Math.sin(Math.toRadians((y2 - y1) / 2.0)),2);
       

        double cos = Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2));
        
        double square = Math.sqrt(sin1 + cos  *  sin2  );
    
       
        
        double distance = 2 * r * Math.asin(square);
        
        System.out.println(distance + " kilometers");
    }
 }