import java.util.HashMap;

public class SubarraySumEqualsK {
    static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;

        // logic -> prefixSum + HashMap
        int count = 0; // carries the result
        int prefixSum = 0;
        HashMap<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0,1);

        for(int num : arr) {
            prefixSum += num;

            count += prefixCount.getOrDefault(prefixSum - k, 0);
            prefixCount.put(prefixSum, prefixCount.getOrDefault(prefixSum, 0) + 1);
        }
        System.out.println(count);

        // brute force
        int count2 = 0;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];
                if(sum == k) count2++;
            }
        }
        System.out.println(count2);
    }
}
