/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comet
 */
import java.io.File;
import java.util.Scanner;

public class Printer {

    private File file;

    public Printer(String fileName) throws Exception {
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        String line;
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            line = reader.nextLine();
            
            if (line.contains(word) || word.isEmpty()) {
                System.out.println(line);
            }
        }

    }

}
