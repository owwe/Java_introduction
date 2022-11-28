public class AudioCollage {
    public static double[] amplify(double[] a, double alpha)
    {
        for (int i = 0; i < a.length; i++)
        {
            a[i] = a[i] * alpha;
        }
        return a;
    }
    
    public static double[] reverse(double[] a)
    {
        int n = a.length;
        for (int i = 0; i < n/2; i++)
        {    
            double temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp; 
        }
        return a;
    }
    public static double[] merge(double[] a, double[] b)
    {
        int n1 = a.length  ;
        int n2 = b.length  ;
        double[] concat = new double[n1 + n2];
        for (int i = 0; i < n1; i++)
        {
            concat[i] = a[i];
        }
        for (int i = 0; i < n2; i++)
        {
            concat[i + n1] = b[i];
        }
        return concat;

    }
    public static double[] mix(double[] a, double[] b)
    {
        int len_a = a.length;
        int len_b = b.length;

        if (len_b > len_a)
        {
            double[] t ;
            t = a;
            a = b;
            b = t;
        }
        len_a = a.length;
        len_b = b.length;
        double[] mixed = new double[len_a];
        for (int i = 0; i < len_b; i++)
        {
            mixed[i] = a[i] + b[i];
        }
        for (int i = len_b; i < len_a; i++)
        {
            mixed[i] = a[i];
        }
        return mixed;

    }
    
    public static double[] changeSpeed(double[] a, double alpha)
    {
        double[] new_piece = new double[(int)(a.length / alpha)];

        for (int i = 0; i <  (int)(a.length / alpha); i++)
        {
            new_piece[i] = a[(int)Math.floor((i * alpha))];
        }
       return new_piece;
    }
    
    public static void main(String[] args)
    {
        
        double alpha = 2;
        
        double[] piano = StdAudio.read("piano.wav");
        double[] exposure = StdAudio.read("exposure.wav");
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] dial = StdAudio.read("dialup.wav");
        double[] singer = StdAudio.read("singer.wav");
        

        double[] union = merge(beatbox, exposure);

        double[] mixed =  mix(singer, dial);
        mixed = amplify(mixed,1.5);
        piano = reverse(piano);

        union = merge(union,mixed);
        union = mix(piano,union);
        double[] speed_up =  changeSpeed(union, alpha);
        
        StdAudio.play(speed_up);
        StdAudio.save("art_nft_2.wav",speed_up);
        
    }
}
