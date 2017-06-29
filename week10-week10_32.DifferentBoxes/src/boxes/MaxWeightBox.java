/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author comet
 */
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MaxWeightBox extends Box {

    private List<Thing> things;
    private int maxWeight;
    

    public MaxWeightBox(int maxWeight) {
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }

    public int getWeight() {
        int currentWeight = 0;
        for (Thing thing: things){
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Thing thing) {
        if (getWeight() + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for (Thing item : things) {
            if (item.equals(thing)) {
                return true;
            }
        }
        return false;
    }

}
