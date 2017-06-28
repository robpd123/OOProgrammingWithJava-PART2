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
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        printIntro();

        while (true) {
            String statement;

            statement = getStatement();

            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            if (statement.equals("add")) {
                add();
            }
            if (statement.equals("translate")) {
                translate();
            }
            System.out.println("");
        }
    }

    private String getStatement() {
        System.out.print("Statement: ");
        return this.reader.nextLine();
    }

    private void add() {
        String finnish;
        String english;

        System.out.print("In Finnish: ");
        finnish = this.reader.nextLine();
        System.out.print("Translation: ");
        english = this.reader.nextLine();

        this.dictionary.add(finnish, english);
    }

    private void translate() {

        String finnish;
        System.out.print("Give a word: ");
        finnish = reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(finnish));
    }

    private void printIntro() {
        String statement = "";
        System.out.println("Statement: ");
        System.out.println("  add - adds a word pair to the dictionary\n"
                + "  translate - asks a word and prints its translation\n"
                + "  quit - quits the text user interface\n");
    }

}
