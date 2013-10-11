package javaapplication1;

public class HistogramViewer {
    
    private Histogram histogram;

    public HistogramViewer(Histogram histogram) {
        this.histogram = histogram;
    }
    
    public void show() {
        for (String name : histogram.keySet()) {
            System.out.println(name + ":" + histogram.get(name));
        }
    }
    
    
}
