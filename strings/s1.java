import java.util.*;
class s1
{
    //approach 1
     public String reverseWords1(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }

    
    //approach 2
    public String reverseWords2(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
    
    
    //aproach 3(best)
    public String reverseWords3(String s) {
        // Trim the input string to remove leading and trailing spaces
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;   // Find the first non-space character
        while (j >= i && s.charAt(j) == ' ') j--;   // Find the last non-space character
        s = s.substring(i, j + 1);                  // Extract the trimmed substring

        // Split the trimmed string into words based on spaces
        String[] words = s.split("\\s+");           // Tokenize the string into words

        // Initialize the output string
        StringBuilder out = new StringBuilder();

        // Iterate through the words in reverse order
        for (int k = words.length - 1; k > 0; k--) {
            // Append the current word and a space to the output
            out.append(words[k]).append(" ");
        }

        // Append the first word to the output (without trailing space)
        return out.append(words[0]).toString();       // Concatenate the reversed words
    }
}
