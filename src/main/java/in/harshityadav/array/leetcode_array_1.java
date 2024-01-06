package in.harshityadav.array;

/*
https://leetcode.com/problems/max-consecutive-ones/description/
*/
public class leetcode_array_1 {

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

        return Math.max(max, count);


    }


}
