/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
public class Statistic {

    private int value1;
    private int value2;
    private int result;
    private String command;

    public Statistic(int value1, int value2, String command, int result) {
        this.value1 = value1;
        this.value2 = value2;
        this.command = command;
        this.result = result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String toString() {
        String returnString = "command: " + command + "\nvalue1: " + value1 + "\nvalue2 " + value2 + "\n" + command + " of the values " + result + "\n";
        return returnString;
    }
}
