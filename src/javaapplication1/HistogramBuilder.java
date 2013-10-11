package javaapplication1;

public class HistogramBuilder {
    private Histogram histogram;

    public void execute(String[] names) {
        histogram = new Histogram();
        calculateHistogram(names);
    }

    public Histogram getHistogram() {
        return histogram;
    }
    
    private void calculateHistogram(String[] names) {
        for (String name : names)
            histogram.put(name, getFrequency(name) + 1);
    }
    
    private int getFrequency(String name) {
        if (histogram.containsKey(name)) return histogram.get(name);
        return 0;
    }
    
}
