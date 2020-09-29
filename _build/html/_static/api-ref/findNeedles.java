public class findNeedles {

/**
 * Counts the number of occurences of specified words present in a given file
 * <p>
 * Searches, counts, and prints the number of occurences of each specified
 * word that exists in a specified file. The file (haystack) is a plain
 * text file. The number of words (needles.length) to search for is limited
 * to five. If the limit is exceeded, the system produces a corresponding
 * error.
 *
 * @param haystack A String object that comprises plain text from a text file.
 * @param needles An array of strings that can include up to five objects.
 * @see <a
 *     href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html">
 *     java.lang.String</a>
 */

  public static void findNeedles(String haystack, String[] needles) {
  if(needles.length > 5) {

    System.err.println("Too many words!");
  }

  else {
    int[] countArray = new int[needles.length];
    for(int i = 0; i < needles.length; i++) {
      String[] words = haystack.split("[ \"\'\t\n\b\f\r]", 0);
      for(int j = 0; j < words.length; j++) {
        if(words[j].compareTo(needles[i]) == 0) {
          countArray[i]++;
          }
        }
      }
    }
  }
}