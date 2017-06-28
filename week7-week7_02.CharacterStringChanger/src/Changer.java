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

public class Changer {
    
    ArrayList<Change> changers;
    
    public Changer(){
        changers = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        changers.add(change);
    }
    
    public String change(String characterString){

        for (Change change:changers){
            characterString = change.change(characterString);
        }
        
        return characterString;
    }
    
}
