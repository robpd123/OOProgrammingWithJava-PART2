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
import java.util.Collections;
import java.util.Scanner;

public class UserInterface {

    private Scanner input;
    private ArrayList<Jumper> jumpers;

    public UserInterface(Scanner input) {
        this.input = input;
        jumpers = new ArrayList<Jumper>();
    }

    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        getNames();

        System.out.println("\nThe tournament begins!\n");

        int round = 1;

        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");

            String in = input.nextLine();

            if (in.equals("jump")) {
                System.out.println("\n\nRound " + round + "\n");
                System.out.println("Jumping order:");

                printJumperOrder();
                
                System.out.println("Results of round " + round);
                takeJumps();

                round++;
            } else {
                break;
            }
        }

        System.out.println("\n\nThanks!\n");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        printTournamentResults();
    }

    private void getNames() {
        while (true) {
            System.out.print("  Participant name: ");
            String name = input.nextLine();

            if (name.equals("")) {
                break;
            }

            this.jumpers.add(new Jumper(name));
        }
    }

    private void printJumperOrder() {
        int i = 1;
        Collections.sort(jumpers);

        for (Jumper jumper : jumpers) {
            System.out.println("  " + i + ". " + jumper);
            i++;
        }
    }

    private void takeJumps() {
        for (Jumper jumper : jumpers) {
            Jump jump = new Jump();
            jump.goJump();

            jumper.addJump(jump.getScore(), jump.getLength());
            
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jump.getLength());
            System.out.println("    judge votes: " + jump.getVotes());
        }
        
        System.out.println("");
    }

    private void printTournamentResults() {
        int i = 1;
        
        Collections.sort(jumpers);
        Collections.reverse(jumpers);
        
        for (Jumper jumper : jumpers){
            System.out.println(i + "           " + jumper);
            System.out.println("            jump lengths: " + jumper.getJumpLengths());
            i++;
        }
    }
}
