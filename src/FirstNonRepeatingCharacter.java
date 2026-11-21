import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static void main(String[] args) {
        String str = "swiss";

        // using LinkedHashMap
        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : str.toCharArray()) {
            if(map.get(c) == 1) {
                System.out.print(c);
                return;
            }
        }
    }
}
