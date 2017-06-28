/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {

    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre() {
        this.observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!this.observationPlaces.containsKey(bird)) {
            this.observationPlaces.put(bird, new ArrayList<String>());
        }
        observationPlaces.get(bird).add(place);
    }

    public void observations(Bird bird) {
        if (observationPlaces.containsKey(bird)) {
            System.out.println(bird + " observations: " + observationPlaces.get(bird).size());
            for (String place : observationPlaces.get(bird)) {
                System.out.println(place);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }
    }
}
