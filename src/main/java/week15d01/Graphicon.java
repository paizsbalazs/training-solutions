package week15d01;

import java.util.Map;

public class Graphicon {

    public int getMax(Map<Integer, Integer> co) {
        int result = 0;
        int max = 0;

        for (Integer i: co.keySet()) {
            if (i>0) {
                max = i;
                result = co.get(i);
            }
        }

        return result;
    }

    public Map.Entry<Double, Double> maxValueEntry(Map<Double, Double> graphOfFunction) {
        if (graphOfFunction.size() == 0 || graphOfFunction.containsKey(Double.MIN_VALUE)) {
            throw new IllegalArgumentException("Wrong param!");
        }
        Map.Entry<Double, Double> maxElement = null;
        double maxValue = Double.MIN_VALUE;

        for (Map.Entry<Double, Double> actual : graphOfFunction.entrySet()) {

            if (maxValue < actual.getValue()) {
                maxElement = actual;
                maxValue = actual.getValue();
            }

        }

        return maxElement;

    }
}
