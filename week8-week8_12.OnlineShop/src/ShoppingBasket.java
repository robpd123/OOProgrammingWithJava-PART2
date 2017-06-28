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
import java.util.Map;

public class ShoppingBasket {
    
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        purchases  = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if (purchases.get(product) != null){
            purchases.get(product).increaseAmount();
            return;
        }
        Purchase temp = new Purchase(product, 1, price);
        purchases.put(product, temp);
    }
    
    public int price(){
        int prices = 0;
        for (Purchase purchase: purchases.values()){
            prices += purchase.price();
        }
        
        return prices;
    }
    
    public void print(){
        for (String key: purchases.keySet()){
            System.out.println( purchases.get(key));
        }
    }
}
