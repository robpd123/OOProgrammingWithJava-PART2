/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.HashMap;
import java.util.ArrayList;

public class AirplaneDatabase {
    
    private HashMap<String, Airplane> airplanes;
    
    public AirplaneDatabase(){
        this.airplanes = new HashMap<String,Airplane>();
    }
    
    public void add(String planeID, Airplane capacity){
        this.airplanes.put(planeID, capacity);
    }
    
    public Airplane findPlane(String planeID){
       if (this.airplanes.containsKey(planeID)){
             return this.airplanes.get(planeID);
       }
        
        return null;
    }
    
    public void print(){
        for (String planeID: this.airplanes.keySet()){
            System.out.println(this.airplanes.get(planeID));
        }
    }
    
    
//    public ArrayList<String> airplaneList(){
//        ArrayList<String> translationList = new ArrayList<String>();
//        
//        for (String key: this.words.keySet()){
//            translationList.add(key + " = " + this.words.get(key));
//        }
//        return translationList;
//    }
    
    
}
