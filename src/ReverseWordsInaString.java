import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInaString {
    static void main(String[] args) {
        String words = "Java is Core Language";

        // with built in functions
        String[] word = words.trim().split("\\s+");
//        Collections.reverse(Arrays.asList(word));
        String reversed = String.join(" ", word);
//        System.out.println(reversed);

        // without built in
        String result = "";
        for(int i=word.length -1 ; i>=0; i--) {
            result += word[i];
            if(i != 0) result += " ";
        }
        System.out.println(result);
    }
}
