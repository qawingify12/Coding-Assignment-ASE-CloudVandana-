import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase to ignore case
        sentence = sentence.toLowerCase();

        // Create a boolean array to keep track of the alphabet letters
        boolean[] alphabet = new boolean[26];

        // Traverse through the sentence and mark the alphabet letters as true
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        // Check if all the alphabet letters are marked as true
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}