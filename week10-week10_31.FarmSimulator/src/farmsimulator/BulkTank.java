/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author comet
 */
public class BulkTank {

    private double totalCapacity;
    private double currentVolume;

    public BulkTank() {
        this(2000);
    }

    public BulkTank(double capacity) {
        this.totalCapacity = capacity;
    }

    public double getCapacity() {
        return totalCapacity;
    }

    public double getVolume() {
        return currentVolume;
    }

    public double howMuchFreeSpace() {
        return totalCapacity - currentVolume;
    }

    public void addToTank(double amount) {
        if (amount < 0.0) {
            return;
        }

        if (amount > howMuchFreeSpace()) {
            currentVolume = totalCapacity;
        } else {
            currentVolume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (amount < 0.0) {
            return 0.0;
        }

        if (amount > currentVolume) {
            currentVolume = 0;
            return currentVolume;
        }
        currentVolume -= amount;
        return amount;
    }
    
    @Override
    public String toString(){
        return Math.ceil(currentVolume) + "/" + Math.ceil(totalCapacity);
    }

}
