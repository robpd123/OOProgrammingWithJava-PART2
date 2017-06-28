/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author comet
 */
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() {
        return readFile().split("\n").length;
    }

    public int characters() {
        return readFile().length();
    }

    private String readFile() {
        try {
            String str = "";
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                str += reader.nextLine() + "\n";
            }
            return str;
            
        } catch (Exception e) {
            System.out.println("No file found");
            return "";
        }
    }
}
