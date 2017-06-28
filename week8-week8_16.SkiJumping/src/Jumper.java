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
import java.util.List;

public class Jumper implements Comparable<Jumper> {

    private String name;
    private int points;
    private List<Integer> jumpLengths;

    public Jumper(String name) {
        this.name = name;
        this.points = 0;
        jumpLengths = new ArrayList<Integer>();
    }
    
    public String getName(){
        return name;
    }
    
    public String getJumpLengths(){
        String lengths = "";
        
        for (int item: jumpLengths){
            lengths += item + " m, ";
        }
        
        return lengths.substring(0, lengths.length()-2);
    }
    
    public void addJump(int points, int jumpLength){
        this.points += points;
        jumpLengths.add(jumpLength);
    }

    @Override
    public int compareTo(Jumper jumper) {
        return this.points - jumper.points;
    }
    
    @Override
    public String toString(){
        return name + " (" + points + " points)";
    }

}
