public class RotateArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int n = arr.length;
        k = k % n;
//        if(k == 0) return;

        int count = 0;
        for(int start = 0; count<n; start++) {
            int curr = start;
            int held = arr[start];

            do{
                int next = (curr + k) % n;
                int saved = arr[next];
                arr[next] = held;
                held = saved;
                curr = next;
                count++;
            } while (curr != start);
        }


//        reverse(arr, 0, n-1);
//        reverse(arr, 0, k-1);
//        reverse(arr, k, n-1);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
