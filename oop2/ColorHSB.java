
public class ColorHSB
{

    private final int hue;
    private final int saturation;
    private final int brightness;
    
    public ColorHSB(int h, int s, int b)
    {
        if (h > 359 || s > 100 || b > 100 )
        {
            throw new IllegalArgumentException();
        }
        hue = h;
        saturation = s;
        brightness = b;
    }

    public String toString()
    {
        return "(" + hue + ", " + saturation + ", " + brightness + ")" ;
    }

    public boolean isGrayscale()
    {
        if (this.brightness == 0 || this.saturation == 0)
            return true;
        return false;
    }
    int distanceSquaredTo(ColorHSB that)
    {
        int arg1 = (int)Math.pow((this.hue - that.hue),2);
        int arg2 = (int)Math.pow((360 - Math.abs(this.hue - that.hue)),2);
        int finalArg = (int)Math.min(arg1, arg2);

        return finalArg + (int)Math.pow((this.saturation - that.saturation),2) + (int)Math.pow(this.brightness - that.brightness,2);

    }
    public static void main(String[] args)
    {
        int h = Integer.parseInt(args[0]);
        int s = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        ColorHSB color1 = new ColorHSB(h, s, b);
        int min_distance = 100000;
        ColorHSB closest_color = new ColorHSB(0,0,0);
        String color = "none";
        
        while (!StdIn.isEmpty())
        {

            String color_selected = StdIn.readString();
            int h1 = StdIn.readInt();
            int s1 = StdIn.readInt();
            int b1 = StdIn.readInt();
            ColorHSB color2 = new ColorHSB(h1,s1,b1);

            int distance = color1.distanceSquaredTo(color2);
            if (distance < min_distance)
            {
                min_distance = distance;
                closest_color = color2;
                color = color_selected;
            }

        }

        System.out.println(color + " " + closest_color);


    }


}

