public class TwoSum {
    static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + target);
                }
            }
        }

        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                break;
            } else if(sum < target) left++;
            else right--;
        }
    }
}
