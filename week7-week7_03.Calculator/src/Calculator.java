/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class Calculator {

    private Reader reader;
    //private Statistics stats;
    private int calcsDone;

    public Calculator() {
        this.reader = new Reader();
   //     this.stats = new Statistics();
        this.calcsDone=0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        System.out.println("sum of the values " + (value1 + value2));
   //     stats.addStatistic(value1, value2, "sum", value1+value2);
        this.calcsDone++;
        // print the value according to the example above
        
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        System.out.println("difference of the values " + (value1 - value2));
   //     stats.addStatistic(value1, value2, "difference", value1-value2);
        this.calcsDone++;
        // print the value according to the example above
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();// read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();// read the value using the Reader-object
        System.out.println("product of the values " + (value1 * value2));
        // print the value according to the example above
   //     stats.addStatistic(value1, value2, "product", value1*value2);
        this.calcsDone++;
    }

    private void statistics() {
       // stats.print();
        System.out.println("Calculations done " + calcsDone);
    }

}
