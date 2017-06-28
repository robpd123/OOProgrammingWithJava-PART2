/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author comet
 */
public class ContainerHistory {

    private List<Double> situations;

    public ContainerHistory() {
        situations = new ArrayList<Double>();
    }

    public void add(double situation) {
        situations.add(situation);
    }

    public void reset() {
        situations.clear();
    }

    public double maxValue() {
        if (!situations.isEmpty()) {
            return Collections.max(situations);
        }
        return 0.0;
    }

    public double minValue() {
        if (!situations.isEmpty()) {
            return Collections.min(situations);
        }
        return 0.0;

    }

    public double average() {
        if (!situations.isEmpty()) {
            double sum = 0;
            for (double situation : situations) {
                sum += situation;
            }

            return sum / situations.size();
        }
        return 0.0;
    }

    public double greatestFluctuation() {
        if (situations.size() > 1) {
            double fluctuation = 0.0;
            for (int i = 1; i < situations.size(); i++) {
                double difference = Math.abs(situations.get(i) - situations.get(i - 1));
                if (difference > fluctuation) {
                    fluctuation = difference;
                }
            }
            return fluctuation;
        }
        return 0.0;
    }

    public double variance() {
        double sum = 0.0;
        double average = average();

        for (double situation : situations) {
            sum += Math.pow((situation - average), 2);
        }
        return sum / (situations.size() - 1);
    }

    @Override
    public String toString() {
        return situations.toString();
    }

}
