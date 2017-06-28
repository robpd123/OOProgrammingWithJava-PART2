/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

/**
 *
 * @author comet
 */
import java.util.Scanner;
import java.util.ArrayList;

import addressBook.AddressBook;

public class UserInterface {

    private Scanner reader;
    private AddressBook addressBook;

    public UserInterface(Scanner reader, AddressBook addressBook) {
        this.reader = reader;
        this.addressBook = addressBook;
    }

    public void start() {
        printOptions();

        while (true) {
            System.out.print("\ncommand: ");
            String command = reader.nextLine();

            if (command.equals("1")) {
                addNumber();
            } else if (command.equals("2")) {
                searchForNumber();
            } else if (command.equals("3")) {
                searchForPerson();
            } else if (command.equals("4")) {
                addAddress();
            } else if (command.equals("5")) {
                searchPersonalInformation();
            } else if (command.equals("6")) {
                deletePersonalInformation();
            } else if (command.equals("7")) {
                searchByKeyword();
            } else if (command.equals("x")) {
                break;
            }
        }
    }

    private void addNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        System.out.print("number: ");
        String number = reader.nextLine();
        addressBook.addNumber(name, number);
    }

    private void searchForNumber() {
        System.out.print("whose number: ");
        String name = reader.nextLine();
        ArrayList<String> numbers = (ArrayList<String>) addressBook.searchForNumberUsingName(name);

        if (numbers != null && !numbers.isEmpty()) {
            for (String number : numbers) {
                System.out.println(" " + number);
            }
        } else {
            System.out.println("  not found");
        }
    }

    private void searchForPerson() {
        System.out.print("number: ");
        String number = reader.nextLine();

        String name = addressBook.searchForNameUsingNumber(number);
        if (name != null) {
            System.out.println(" " + name);
        } else {
            System.out.println(" not found");
        }
    }

    private void addAddress() {
        System.out.print("whose address: ");
        String name = reader.nextLine();
        System.out.print(" street: ");
        String street = reader.nextLine();
        System.out.print(" city: ");
        String city = reader.nextLine();

        addressBook.addAddress(name, city, street);
    }

    private void searchPersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        String address = addressBook.searchForAddressUsingName(name);
        ArrayList<String> numbers = (ArrayList<String>) addressBook.searchForNumberUsingName(name);

        if (address == null && ((numbers == null) || (numbers.isEmpty()))) {
            System.out.println("  not found");
            return;
        }

        if (address == null || address.equals(" ")) {
            System.out.println("  address unknown");
        } else {
            System.out.println("  address: " + address);
        }

        if (numbers != null && !numbers.isEmpty()) {
            System.out.println("  phone numbers:");
            for (String number : numbers) {
                System.out.println("    " + number);
            }
        } else {
            System.out.println("phone number not found");
        }
    }

    private void deletePersonalInformation() {
        System.out.print("whose information: ");
        String name = reader.nextLine();

        addressBook.delete(name);
    }

    private void searchByKeyword() {
        System.out.print("keyword (if empty all listed): ");
        String keyword = reader.nextLine();
        

        ArrayList<String> names = (ArrayList<String>) addressBook.searchNamesUsingKeyword(keyword);

        if (names.isEmpty()) {
           // System.out.println("");
            System.out.println("  not found");
        } else {
            System.out.println("");
            for (String name : names) {
                System.out.println("  " + name);
                if (addressBook.searchForAddressUsingName(name) == null) {
                    System.out.println("address unknown");
                } else {
                    System.out.println("address: " + addressBook.searchForAddressUsingName(name));
                }
                System.out.println("phone numbers: ");
                ArrayList<String> numbers = (ArrayList<String>) addressBook.searchForNumberUsingName(name);
                if (numbers != null && !numbers.isEmpty()) {
                    for (String number : numbers) {
                        System.out.println(" " + number);
                    }
                } else {
                    System.out.println("  not found");
                }

            }
        }

    }

    private void printOptions() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
    }

}
