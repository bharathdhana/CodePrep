public class LargestInArray {
    static void main(String[] args) {
        int[] arr = {10,20,33,27,19};
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
//        for(int i=0; i<arr.length; i++) {
//            if(largest < arr[i]) {
//                largest = arr[i];
//            }
//        }

        for(int num : arr) {
            if(largest < num)
                largest = num;
        }
        System.out.println(largest);

        // identify second largest

        for(int num2 : arr) {
            if (num2 > largest) {
                secondlargest = largest;
                largest = num2;
            } else if (num2 > secondlargest && num2 != largest) {
                secondlargest = num2;
            }
        }
        System.out.println(secondlargest);
    }
}
