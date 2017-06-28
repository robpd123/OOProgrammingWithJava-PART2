/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

/**
 *
 * @author comet
 */
import java.util.List;
import java.util.ArrayList;
import moving.domain.Thing;
import moving.domain.Box;

public class Packer {
    int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        List<Box> boxes = new ArrayList<Box>();
        Box box = new Box(boxesVolume);
        
        boolean passed = true;
        
        for (Thing thing: things){
            passed = box.addThing(thing);
            
            if (!passed){
                boxes.add(box);
                box = new Box(boxesVolume);
                box.addThing(thing);
            }
        }
        boxes.add(box);
        return boxes;
    }
}
