import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    static void main(String[] args) {
        String str = "abcabcbb";

        // using HashSet
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            while(window.contains(ch)) {
                window.remove(ch);
                left++;
            }
            window.add(ch);
            maxLen = Math.max(maxLen, i - left + 1);
        }
        System.out.println(maxLen);
    }
}
