package in.harshityadav.array;

public class A002evenNumberDigits {


    private A002evenNumberDigits() {
        throw new IllegalStateException("Utility Class");
    }


    public static int evenNumberDigits(int[] nums) {

        if (nums.length == 0)
            return 0;
        int evenCounter = 0;
        for (int i : nums) {
            int digits = 0;
            while (i != 0) {

                digits++;
                i = i / 10;

            }
            if (digits % 2 == 0) {
                evenCounter++;
            }
        }

        return evenCounter;

    }


}
