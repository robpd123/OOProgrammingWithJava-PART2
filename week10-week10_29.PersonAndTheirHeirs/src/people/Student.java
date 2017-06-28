/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author comet
 */
public class Student extends Person {
    private int credits;
    
    
    public Student(String name, String address) {
        super(name, address);
    }
    
    public int credits(){
        return this.credits;
    }
    
    public void study(){
        credits++;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString()).append("\n  credits ").append(this.credits());
        return sb.toString();
    }
    
}
