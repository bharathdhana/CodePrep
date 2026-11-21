import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
    static void main(String[] args) {
        String str = "geekforgeeks";

        // HashSet
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        System.out.println(result);
    }
}
