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

public class FlightDatabase {
    private ArrayList<Flight> flights;
    
    public FlightDatabase(){
        this.flights = new ArrayList<Flight>();
    }
    
    public void addFlight(Airplane airplane, String departureCode, String arrivalCode){
        Flight temp = new Flight(airplane, departureCode, arrivalCode);
        this.flights.add(temp);
    }
    
    public void print(){
        for (Flight flight: flights){
            System.out.println(flight.toString());
        }
    }
}
