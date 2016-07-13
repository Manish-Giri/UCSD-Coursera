/**
 * Created by manishgiri on 7/12/16.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsChecker {

    /**
     * Get the number of words in the document.
     * A "word" is defined as a contiguous string of alphabetic characters
     * i.e. any upper or lower case characters a-z or A-Z.  This method completely
     * ignores numbers when you count words, and assumes that the document does not have
     * any strings that combine numbers and letters.
     *
     * Check the examples in the main method below for more information.
     *
     * This method should process the entire text string each time it is called.
     *
     * @return The number of words in the document.
     */
    private static int getNumWords(String line)
    {
        //TODO: Implement this method in week 1 according to the comments above.
        // See the Module 1 support videos if you need help.
        String pattern = "[a-zA-Z]+";
        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        int count = 0;
        // Now create matcher object.
        //String line = "This is a sentence";
        Matcher m = r.matcher(line);
        while(m.find()) {
            //System.out.println("Number of words = " + m.groupCount());
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int result = getNumWords(line);
        System.out.println("Number of words = " + result);
    }
}
