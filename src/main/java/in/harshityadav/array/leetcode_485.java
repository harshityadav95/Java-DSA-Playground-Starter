package in.harshityadav.array;

public class leetcode_485 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;
        if (nums.length == 0) {
            return 0;
        }
        for (int i : nums) {
            if (i == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }

        }

        return Math.max(max,count);


    }


}
