import java.util.Arrays;

public class MergeSortedArr {
    static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] res = new int[arr1.length * 2];
        int index = 0;
        for(int num : arr1) {
            res[index] = num;
            index++;
        }
        for(int num : arr2) {
            res[index] = num;
            index++;
        }

        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
