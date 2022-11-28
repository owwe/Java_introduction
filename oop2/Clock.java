
public class Clock {

    private int hours;
    private int minutes;

    public Clock(int h, int m)
    {
        if ((h < 0 || h > 23) && (m < 0 || m > 59) )
        {
            throw new IllegalArgumentException();
        }
        hours = h;
        minutes = m;
    }   
    public Clock(String s)
    {

        String[] time = s.split(":");
        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt( time[1]);
        if ((h < 0 || h > 23) && (m < 0 || m > 59) )
        {
            throw new IllegalArgumentException();
        }
        hours = h;
        minutes = m;


    }
    public String toString()
    {
   
        return String.format("%02d" + ":" + "%02d",this.hours ,this.minutes);
 
    }
    public void tic()
    {
        this.minutes += 1;
        if (this.minutes == 60)
        {
            this.hours += 1;
            this.minutes = 0;
            if (this.hours > 23)
            {
                this.hours = 0;
            }
        }
    }
    
    public void toc (int delta)
    {
        this.minutes += delta % 60;
        this.hours += delta / 60;
        if (this.minutes > 59)
        {
            this.minutes -= 60;
            this.hours ++;
            if (this.hours > 23)
            {
                this.hours = this.hours % 24;
            }   
        }
        if (this.hours > 23)
        {
            this.hours = this.hours % 24;
        }
        
         
    }
    public boolean isEarlierThan(Clock that)
    {
        if (this.hours > that.hours)
        {
            return true;
        }
        else if (this.hours == that.hours && this.minutes > that.minutes)
        {
            return true;
        }
        else
            return false;
    }

     public static void main(String[] args)
     {
        
    
        Clock clock = new Clock("11:59");
      
        clock.toc(45);
        System.out.println(clock);
     }
}
