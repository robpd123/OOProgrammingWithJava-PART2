/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author comet
 */
import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class WordInspection {

    private File file;
    private List<String> words;

    public WordInspection(File file) {
        this.file = file;
        words = new ArrayList<String>();
        readFile();
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> returnList = new ArrayList<String>();

        for (String word : words) {
            if (containsAllVowels(word)) {
                returnList.add(word);
            }
        }

        return returnList;
    }

    public List<String> palindromes() {
        List<String> returnList = new ArrayList<String>();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (isPalindrome(word)) {
                    returnList.add(word);
                }
            }
        }

        return returnList;
    }

    public List<String> wordsContainingZ() {
        List<String> returnList = new ArrayList<String>();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.contains("z")) {
                    returnList.add(word);
                }
            }
        }

        return returnList;
    }

    public List<String> wordsEndingInL() {
        List<String> returnList = new ArrayList<String>();

        for (String word : words) {
            if (!word.isEmpty()) {
                if (word.substring(word.length() - 1).contains("l")) {
                    returnList.add(word);
                }
            }
        }

        return returnList;
    }

    private boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder(word);
        
        if (word.contains(sb.reverse().toString())){
            return true;
        }
        return false;
    }

    private boolean containsAllVowels(String word) {
        char[] letters = {'a', 'e', 'i', 'o', 'u', 'y', 'ä', 'ö'};

        for (int i = 0; i < letters.length; i++) {
            if (!word.contains(Character.toString(letters[i]))) {
                return false;
            }
        }
        return true;
    }

    private void readFile() {
        try {
            Scanner reader = new Scanner(file, "UTF-8");

            while (reader.hasNextLine()) {
                words.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("No file found");
        }

    }
}
