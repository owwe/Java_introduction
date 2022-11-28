import java.util.Arrays;
public class Bar implements Comparable<Bar> {
    private String name;
    private int value;
    private String category;

    public  Bar(String n, int v, String c)
    {
      name = n;
      value = v;
      category = c;
      if ((name == null ) || (value < 0) || (category == null))
        {
            throw new IllegalArgumentException();
        }
    }
    public String getName()
    {
        return this.name;
    }
    public int getValue()
    {
        return this.value;
    }
    public String getCategory()
    {
        return this.category;
    }
    public int compareTo(Bar that)
    {
        if (this.name == null || that.name == null ||  this.category == null || that.category == null)
        {
            throw new NullPointerException();
        }
        return this.value - that.value;

     
    }
    public static void main(String[] args)
    {
        Bar city1 = new Bar("Beijing",     22674, "East Asia");
        String s = city1.getName();
        int a = city1.getValue();
        String d = city1.getCategory();
        Bar city2 = new Bar("Tokyo",     30000, "East Asia");
        int f = city1.compareTo(city2);




     

    }
}