/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;

/**
 *
 * @author comet
 */
import java.util.Map;
import java.util.HashMap;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Map<String, Integer> words;

    public PersonalDuplicateRemover() {
        words = new HashMap<String, Integer>();
    }

    @Override
    public void add(String characterString) {
        if (!words.containsKey(characterString)) {
            words.put(characterString, 0);
        } else {
            int numDuplicates = words.get(characterString)+1;
            words.put(characterString, numDuplicates);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        int numDuplicates = 0;
        for (String key : words.keySet()) {
            numDuplicates += words.get(key);
        }
        return numDuplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return words.keySet();
    }

    @Override
    public void empty() {
        words = new HashMap<String, Integer>();
    }

}
