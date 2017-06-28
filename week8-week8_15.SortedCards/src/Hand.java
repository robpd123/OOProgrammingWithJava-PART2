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
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    
    private ArrayList<Card> cards;
    
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void add(Card card){
        cards.add(card);
    }
    
    public void print(){
        for (Card card: cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
    
    public int sum(){
        int sumOfCards = 0;
        for (Card card: cards){
            sumOfCards += card.getValue();
        }
        return sumOfCards;
    }
    
    @Override
    public int compareTo(Hand hand){
        return this.sum() - hand.sum();
    }
}
