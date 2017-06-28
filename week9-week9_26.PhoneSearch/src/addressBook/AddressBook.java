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
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

public class AddressBook {

    Map<String, List<String>> phoneNumbers;
    Map<String, Address> addresses;

    public AddressBook() {
        phoneNumbers = new HashMap<String, List<String>>();
        addresses = new HashMap<String, Address>();
    }

    public void addNumber(String name, String number) {
        if (!phoneNumbers.keySet().contains(name)) {
            phoneNumbers.put(name, new ArrayList<String>());
            //addresses.put(name, new Address("", ""));
        }

        phoneNumbers.get(name).add(number);
    }

    public void addAddress(String name, String city, String street) {
        addresses.put(name, new Address(city, street));

//        if (!phoneNumbers.keySet().contains(name)) {
//            phoneNumbers.put(name, new ArrayList<String>());
//        }
    }

    public List<String> searchForNumberUsingName(String name) {
        return phoneNumbers.get(name);
    }

    public String searchForNameUsingNumber(String number) {
        for (String key : phoneNumbers.keySet()) {
            for (String num : phoneNumbers.get(key)) {
                if (num.equals(number)) {
                    return key;
                }
            }
        }
        return null;
    }

    public String searchForAddressUsingName(String name) {
        Address foundAddress = addresses.get(name);
        
        if (foundAddress != null){
           return addresses.get(name).getStreet() + " " + addresses.get(name).getCity(); 
        }
        
        return null;
        
    }

    public List<String> searchForNameUsingAddress(String keyword) {
        List<String> names = new ArrayList<String>();
        for (String key : addresses.keySet()) {
            if (addresses.get(key).getCity().contains(keyword) || addresses.get(key).getStreet().contains(keyword)) {
                names.add(key);
            }
        }
        return names;
    }
    
    public List<String> searchNames(String keyword){
        Set<String> namesNoDuplicates = new HashSet<String>();
        List<String> names;
        
        for (String key: phoneNumbers.keySet()){
            if (key.contains(keyword)){
                namesNoDuplicates.add(key);
            }
        }
        
        for (String key: addresses.keySet()){
            if (key.contains(keyword)){
                namesNoDuplicates.add(key);
            }
        }
        
        if (namesNoDuplicates.isEmpty()){
            return null;
        }
        
        names = new ArrayList<String>(namesNoDuplicates);
        return names;
    }

    public List<String> searchNamesUsingKeyword(String keyword) {
        //List<String> names = new ArrayList<String>();
        Set<String> names = new HashSet<String>();
        
        if (searchNames(keyword) != null){
            names.addAll(searchNames(keyword));
        }
        
        if (searchForNumberUsingName(keyword) != null) {
            names.add(keyword);
        }
        
        if (searchForNameUsingNumber(keyword) != null){
            names.add(searchForNameUsingNumber(keyword));
        }
        
        if (searchForAddressUsingName(keyword) != null){
            names.add(keyword);
        }
        
        if (!searchForNameUsingAddress(keyword).isEmpty()){
            names.addAll(searchForNameUsingAddress(keyword));
        }
        
        List<String> namesSorted = new ArrayList<String>(names);
        Collections.sort(namesSorted);
        
        return namesSorted;
    }
    
    public void delete(String name) {
        phoneNumbers.remove(name);
        addresses.remove(name);
    }

}
