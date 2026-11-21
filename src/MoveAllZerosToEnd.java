import java.util.Arrays;

public class MoveAllZerosToEnd {
    static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        Arrays.sort(arr);

//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
        int left = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[left];
                arr[left] = arr[i];
                arr[i] = temp;
                left++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
