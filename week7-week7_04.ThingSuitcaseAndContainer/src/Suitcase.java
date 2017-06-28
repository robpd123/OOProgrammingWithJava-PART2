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

public class Suitcase {

    private ArrayList<Thing> thingsInSuitcase;
    private int maxWeightLimit;

    public Suitcase(int maxWeightLimit) {
        this.thingsInSuitcase = new ArrayList<Thing>();
        this.maxWeightLimit = maxWeightLimit;
    }

    public void addThing(Thing thing) {
        int combinedWeight = totalWeight() + thing.getWeight();

        if (combinedWeight <= this.maxWeightLimit) {
            this.thingsInSuitcase.add(thing);
        }
    }

    @Override
    public String toString() {
        String returnString = "";

        if (this.thingsInSuitcase.size() == 0) {
            return "empty (0 kg)";
        } else if (this.thingsInSuitcase.size() == 1) {
            returnString += "1 thing ";
        } else {
            returnString += this.thingsInSuitcase.size() + " things ";
        }

        returnString += "(" + totalWeight() + " kg)";
        return returnString;
    }

    public void printThings() {
        for (Thing thing : this.thingsInSuitcase) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : this.thingsInSuitcase) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing() {
        if (!this.thingsInSuitcase.isEmpty()) {
            Thing heaviestThing = this.thingsInSuitcase.get(0);

            for (Thing thing : this.thingsInSuitcase) {
                if (thing.getWeight() > heaviestThing.getWeight()) {
                    heaviestThing = thing;
                }
            }
            return heaviestThing;
        }
        return null;
    }

}
