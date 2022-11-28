import java.util.Arrays;

public class BarChartRacer {

    public static void main(String[] args)
    {
        String file = args[0];
        int display = Integer.parseInt(args[1]);
        In data = new In(file);
        String title = data.readLine();
        String x_axis = data.readLine();
        String source = data.readLine();
        StdDraw.setCanvasSize(1000,700);
        StdDraw.enableDoubleBuffering();

        BarChart chart = new BarChart (title, x_axis, source);
        //StdAudio.loopInBackground("piano.wav");

        while(data.hasNextLine())
        {

            int total = data.readInt();
            Bar[] list = new Bar[total];
            for(int i = 0; i < total; i ++)
            {
                   
                String line = data.readLine();
                if (line.isEmpty())
                    line = data.readLine();
                String[] elements = line.split(",");
                String caption =  elements[0];
                String name = elements[1];
                String value = elements[3];
                int intValue = Integer.parseInt(value);
                String category = elements[4];
                list[i] = new Bar(name,intValue,category);
                chart.setCaption(caption);

            }
            Arrays.sort(list);
            for(int i = 0; i < display; i ++)
            {
                chart.add(list[display - i - 1 ].getName(), list[display - i - 1 ].getValue(),list[display - i - 1].getCategory());
                
                

            }
            chart.draw();
            StdDraw.show();
            StdDraw.pause(50);
            chart.reset();
            StdDraw.clear();

            
        }
        //StdAudio.close();

    }
}
