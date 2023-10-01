package in.harshityadav.array;

public class leetcode_1295 {

    public static int findNumbers(int[] nums) {

        int output = 0;
        for (int i : nums) {

            int digits = 0;
            while (i != 0) {
                digits++;
                i = i / 10;
            }
            if (digits % 2 == 0) output++;


        }
        return output;

    }


}
