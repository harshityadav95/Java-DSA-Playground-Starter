package in.harshityadav.array;

class A001maxConsecutiveOne {

    private A001maxConsecutiveOne() {
        throw new IllegalStateException("Utility Class");
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int maxcount = 0;
        int localcount = 0;
        for (int i : nums) {

            if (i != 1) {
                maxcount = Math.max(maxcount, localcount);
                localcount = 0;
            } else {
                localcount++;
            }


        }
        maxcount = Math.max(maxcount, localcount);

        return maxcount;

    }


}
