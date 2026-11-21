import java.util.HashSet;

public class RemoveDuplicatesFromArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10};

        int[] unique = new int[arr.length];
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            boolean found = false;
            for(int j=0; j<count; j++) {
                if(arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                unique[count] = arr[i];
                count++;
            }
        }
        for(int i=0; i<count; i++) {
            System.out.println(unique[i] + " ");
        }

        // Using HashSet

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr) {
            set.add(num);
        }
        System.out.println(set);
    }
}
