/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author comet
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        things = new ArrayList<Thing>();
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing) {
        if ((thing.getVolume() + calcVolume()) > maximumCapacity) {
            return false;
        }
        things.add(thing);
        return true;
    }

    private int calcVolume() {
        int volume = 0;

        for (Thing thing : things) {
            volume += thing.getVolume();
        }
        return volume;
    }

    @Override
    public int getVolume() {
        return calcVolume();
    }


}
