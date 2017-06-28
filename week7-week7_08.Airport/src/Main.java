
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        AirplaneDatabase airplanes = new AirplaneDatabase();
        FlightDatabase flights = new FlightDatabase();
        //Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, airplanes, flights);
        ui.start();
    }
}
