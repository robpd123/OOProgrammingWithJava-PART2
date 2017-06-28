package file;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here
        Analysis analyser;
        File file = new File("src/testfile.txt");
        try {
            analyser = new Analysis(file);
        } catch (Exception e) {
            System.out.println("File not found");
            return;
        }

        System.out.println("Lines " + analyser.lines());
        System.out.println("Characters " + analyser.characters());

    }
}
