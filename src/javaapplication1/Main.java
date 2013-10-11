package javaapplication1;

import java.util.HashMap;

public class Main {
    
    public static void main(String[] args) {
        HistogramBuilder builder = new HistogramBuilder();
        builder.execute(new String[] {"Jose", "Javier", "Luis", "Luis", "Javier", "Carlos", "Jose", "Luis"});
        HistogramViewer viewer = new HistogramViewer(builder.getHistogram());
        viewer.show();
    }
    
}
