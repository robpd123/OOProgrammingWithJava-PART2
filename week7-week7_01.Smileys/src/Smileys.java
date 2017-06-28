
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("87.");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {

        if (characterString.length() % 2 == 1) {
            characterString = characterString + " ";
        }

        printRowSmileys(characterString);
        printRowCharacter(characterString);
        printRowSmileys(characterString);

    }

    private static void printSmiley() {
        System.out.print(":)");
    }

    private static void printRowSmileys(String characterString) {
        int numSmileys;

        numSmileys = characterString.length() / 2 + 3;

        for (int i = 0; i < numSmileys; i++) {
            printSmiley();
        }
        System.out.println("");
    }

    private static void printRowCharacter(String characterString) {
        System.out.println(":) " + characterString + " :)");
    }

}
