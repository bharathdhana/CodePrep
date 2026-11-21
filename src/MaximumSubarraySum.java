public class MaximumSubarraySum {
    static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        // bruteForce approach
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            for(int j=i; j<arr.length; j++) {
                sum += arr[j];

                if(sum > maxSum)
                    maxSum = sum;
            }
        }
        System.out.println(maxSum);

        // Kadane's algorithm

        int currentSum = arr[0];
        int maxSum2 = arr[0];

        for(int i=0; i<arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum2 = Math.max(maxSum2, currentSum);
        }
        System.out.println(maxSum2);
    }
}
