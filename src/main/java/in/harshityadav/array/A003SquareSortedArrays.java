package in.harshityadav.array;

public class A003SquareSortedArrays {

    private A003SquareSortedArrays() {
        throw new IllegalStateException("Utility Class");
    }

    public static int[] sortedSquares(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] output = new int[nums.length];
        while (left != right) {

            int max;
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                max = nums[left];
                left++;
            } else {
                max = nums[right];
                right--;
            }
            output[index] = max * max;
            index--;


        }

        return output;

    }


}
