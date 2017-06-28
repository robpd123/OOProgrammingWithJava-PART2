/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean on;
    private int sensorValue;

    public Thermometer() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public int measure() {
        if (!on){
            throw new IllegalStateException("Thermometer is turned off");
        }
        
        Random random = new Random();
        sensorValue = random.nextInt(61) - 30;
        return sensorValue;
    }

}
