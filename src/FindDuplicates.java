import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    static void main(String[] args) {
        // using HashMap
        String str = "geekforgeeks";
        Map<Character, Integer> map = new HashMap<>();

//        if(str.isEmpty() || str == null) { return; } -> edge cases

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // To find the character occurrences in string
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }

        // sorting
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[i+1]) {
                System.out.println(arr[i]);
                while (i<arr.length-1 && arr[i] == arr[i+1]) i++;
//                    System.out.println(arr[j]);
//                    break;
                }
            }
        }
    }

