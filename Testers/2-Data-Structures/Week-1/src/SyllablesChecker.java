import java.util.Scanner;

/**
 * Created by manishgiri on 7/12/16.
 */
public class SyllablesChecker {

    private static int countSyllables(String word) {
        // TODO: Implement this method so that you can call it from the
        // getNumSyllables method in BasicDocument (module 1) and
        // EfficientDocument (module 2).
        int syllablesCount = 0;
        boolean lastLetterIsSyllable = false;
        char[] wordLetters = word.toCharArray();
        char[] syllables = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int i = 0; i < wordLetters.length; i++) {
            //i is now the last letter in word, cannot proceed to next letter
            if (i == wordLetters.length - 1) {
                //check if i is E -> not a syllable
                if (Character.toLowerCase(wordLetters[i]) == Character.toLowerCase('E')) {
                    if(lastLetterIsSyllable) {
                        syllablesCount++;
                        return syllablesCount;
                    }
                    else {
                        return syllablesCount;
                    }
                } else {
                    //check if i is a vowel -> increase count
                    if (isSyllable(wordLetters[i])) {
                        lastLetterIsSyllable = true;
                        syllablesCount++;

                    }
                    return syllablesCount;
                }
            }

            //i is not the last letter in word
            else {
                if (isSyllable(wordLetters[i])) {
                    if (isSyllable(wordLetters[i + 1])) {
                        lastLetterIsSyllable = true;
                        continue;
                    } else {
                        lastLetterIsSyllable = false;
                        syllablesCount++;
                    }
                }

            }
        }

        return syllablesCount;
    }

    private static boolean isSyllable(char c) {
        char[] syllables = {'A', 'E', 'I', 'O', 'U', 'Y'};
        for (char x : syllables) {
            if (Character.toLowerCase(c) == Character.toLowerCase(x)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String word = scanner.nextLine();
        int num = countSyllables(word);
        System.out.println("Number of syllables in " + word + " is " + num);
    }
}
