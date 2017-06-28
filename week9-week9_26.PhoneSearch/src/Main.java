import java.util.Scanner;
import userInterface.UserInterface;
import addressBook.AddressBook;


public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        AddressBook addressBook = new AddressBook();
        Scanner reader = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(reader, addressBook);
        
        ui.start();
        
    }
}
