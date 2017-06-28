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

public class Container {

    private ArrayList<Suitcase> suitcasesInContainer;
    private int maxWeightLimit;

    public Container(int maxWeightLimit) {
        this.suitcasesInContainer = new ArrayList<Suitcase>();
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addSuitcase(Suitcase suitcase) {
        int combinedWeight = totalWeight() + suitcase.totalWeight();

        if (combinedWeight <= this.maxWeightLimit) {
            this.suitcasesInContainer.add(suitcase);
        }
    }

    public String toString() {
        return this.suitcasesInContainer.size() + " suitcases (" + totalWeight() + " kg)";

    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcasesInContainer) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;

    }
    
    public void printThings(){
        for (Suitcase suitcase: suitcasesInContainer){
            suitcase.printThings();
        }
    }

}
