/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressBook;

/**
 *
 * @author comet
 */
public class Address {
    private String city;
    private String street;
    
    public Address(String city, String street){
        this.city = city;
        this.street = street;
    }
    
    public String getCity(){
        return city;
    }
    
    public String getStreet(){
        return street;
    }
    
}
