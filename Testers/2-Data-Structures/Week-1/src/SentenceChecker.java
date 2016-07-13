import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by manishgiri on 7/12/16.
 */
public class SentenceChecker {
    /**
     * Get the number of sentences in the document.
     * Sentences are defined as contiguous strings of characters ending in an
     * end of sentence punctuation (. ! or ?) or the last contiguous set of
     * characters in the document, even if they don't end with a punctuation mark.
     *
     * Check the examples in the main method below for more information.
     *
     * This method should process the entire text string each time it is called.
     *
     * @return The number of sentences in the document.
     */
    private static int getNumSentences(String line)
    {
        //TODO: Implement this method.  See the Module 1 support videos
        // if you need help.
        String pattern = "[^?.!]+";
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
        int result = getNumSentences(line);
        System.out.println("Number of sentences = " + result);
    }
}
