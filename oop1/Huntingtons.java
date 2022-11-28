public class Huntingtons
{

    public static int maxRepeats(String dna)
    {
        String crib = "CAG";
        int max = 0;
        int current = 0;
        int index = 0;
        while (index != -1)
        {
            index = dna.indexOf(crib);
            if (index == 0)
            {
                dna = dna.substring(3);
                current++;
                if (current > max)
                    max = current;
            }
            else if (index > 0)
            {
                dna = dna.substring(index);
                current = 0;
            }
            else
                break;

        }
        return max;
    }
    public static String diagnose (int maxRepeats)
    {
        if (maxRepeats <= 9 || maxRepeats > 180)
            return "not human";
        else if (maxRepeats <= 35)
            return "normal";
        else if (maxRepeats <= 39)
            return "high risk";
        else
            return "Huntington's";
        
    }

       
    public static String removeWhitespace(String s)
    {
        s = s.replace("\t", "");
        s = s.replace("\n", "");
        s = s.replace(" ", "");
        return s;

    }
    public static void main(String[] args) 
    {
        String file = args[0];
        In reader = new In (file);
        String dna = reader.readAll();
        //System.out.println(dna.length());
        dna = removeWhitespace(dna);
        int max_count  = maxRepeats(dna);
        System.out.println("max repeats = " + max_count);
        System.out.println(diagnose(max_count));
        //System.out.println(dna);


    }
}