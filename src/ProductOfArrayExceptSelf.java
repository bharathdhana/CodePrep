public class ProductOfArrayExceptSelf {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        int[] result = new int[arr.length];

        prefix[0] = 1;
        for(int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        suffix[arr.length-1] = 1;
        for(int i=arr.length-2; i>=0; i--) {
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for(int i=0; i<arr.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
