/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.ArrayList;

public class Statistics {

    private ArrayList<Statistic> statistics;

    public Statistics() {
        statistics = new ArrayList<Statistic>();
    }
    public void addStatistic(int value1, int value2, String command, int result){
        Statistic stat = new Statistic(value1, value2, command, result);
        statistics.add(stat);
    }
    
    public void print(){
        for (Statistic stat: statistics){
            System.out.println(stat);
        }
    }

}
