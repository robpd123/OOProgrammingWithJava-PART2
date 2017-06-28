/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Jump {
    private int length;
    private List<Integer> votes;
    
    public Jump(){
        votes = new ArrayList();
    }
    
    public void goJump(){
        for (int i = 0; i < 5; i++){
            votes.add(RandomInt(10,20));
        }
        
        this.length = RandomInt(60,120);
    }
    
    public int getLength(){
        return length;
    }
    
    public int getScore(){
        int score = 0;
        Collections.sort(votes);
        
        for (int i = 1; i < 4; i++){
            score += votes.get(i);
        }
        
        return score + length;
    }
    
    public String getVotes(){
        return "" + votes;
    }
    
    private int RandomInt(int min, int max){
        Random random = new Random();
        
        return random.nextInt(max-min+1) + min;
    }
    
}
