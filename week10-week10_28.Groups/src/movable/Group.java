/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author comet
 */
public class Group implements Movable {

    private List<Movable> organisms;

    public Group() {
        organisms = new ArrayList<Movable>();
    }

    public void addToGroup(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable organism: organisms){
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String returnString = "";
        for (Movable organism : organisms) {
            returnString += organism + "\n";
        }
        return returnString;
    }

}
