/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private AirplaneDatabase planes;
    private FlightDatabase flights;

    public TextUserInterface(Scanner reader, AirplaneDatabase planes, FlightDatabase flights) {
        this.reader = reader;
        this.planes = planes;
        this.flights = flights;
    }

    public void start() {
        System.out.println("Airport panel\n--------------------\n");

        while (true) {
            System.out.println("Choose operation");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");

            String operation = reader.nextLine();

            if (operation.equals("x")) {
                break;
            }
            handleOperation1(operation);
        }

        System.out.println("Flight service\n------------\n");

        while (true) {
            System.out.println("Choose operation");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");

            String operation = reader.nextLine();

            if (operation.equals("x")) {
                break;
            }
            handleOperation2(operation);
        }

    }

    private void handleOperation1(String operation) {
        if (operation.contains("1")) {
            addPlane();
        }
        if (operation.contains("2")) {
            addFlight();
        }
    }

    private void handleOperation2(String operation) {
        if (operation.contains("1")) {
            printPlanes();
        }
        if (operation.contains("2")) {
            printFlights();
        }
        if (operation.contains("3")) {
            printPlaneInfo();
        }

    }

    private void addPlane() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());

        Airplane tempPlane = new Airplane(planeID, capacity);

        this.planes.add(planeID, tempPlane);
    }

    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();

        if (planes.findPlane(planeID) != null) {
            System.out.print("Give departure airport code: ");
            String departureCode = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destinationCode = reader.nextLine();

            flights.addFlight(planes.findPlane(planeID), departureCode, destinationCode);
            return;
        }

        System.out.println("Flight not found");

    }

    private void printPlanes() {
        planes.print();
    }

    private void printFlights() {
        this.flights.print();
    }

    private void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = this.reader.nextLine();
        
        if (this.planes.findPlane(planeID) != null){
            System.out.println(this.planes.findPlane(planeID));
            return;
        }
        
        System.out.println("Plane not found");
    }
    
}
