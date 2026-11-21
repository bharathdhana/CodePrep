import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    static void main(String[] args) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentStreak = 1;
                int currentNum = num;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        System.out.println(longestStreak);
    }
}
