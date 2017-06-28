/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author comet
 */
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    
    public List<Integer> readings(){
        return readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()){
            throw new IllegalStateException("Sensor is not turned on");
        }
        if (sensors.isEmpty()){
            throw new IllegalStateException("Does not contain any sensors");
        }
        
        int averageReading= 0;
        
        for (Sensor sensor: sensors){
            averageReading += sensor.measure();
        }
        
        int reading = averageReading/sensors.size();
        readings.add(reading);
        
        return reading;
    }

}
