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

public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null){
            this.owners.put(plate, owner);
            return true;
        }
        return false;
    }

    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) == null){
            return false;
        }
        
        this.owners.put(plate, null);
        return true;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate: this.owners.keySet()){
            System.out.println(plate.toString());
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownersList = new ArrayList<String>();
        
        for (RegistrationPlate plate: this.owners.keySet()){
            if (!ownersList.contains(this.owners.get(plate))){
                System.out.println(this.owners.get(plate));
                ownersList.add(this.owners.get(plate));
            }
        }
    }

}
