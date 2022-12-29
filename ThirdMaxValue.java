public class ThirdMaxValue {
    public int thirdMax(int[] nums) {
        // int[] array = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        // System.out.println(nums[0]);
        Integer big = null;
        Integer med = null;
        Integer small = null;
        // int notDistinct = 0;
        for (int i = 0; i < nums.length; i++) {
            if (big == null) {
                big = Integer.valueOf(nums[i]);
            } else if (big.intValue() == nums[i]) {
                // do nothing
            } else if (nums[i] > big.intValue()) {
                small = med;
                med = big;
                big = Integer.valueOf(nums[i]);
            } else if (med == null) {
                med = Integer.valueOf(nums[i]);
            } else if (nums[i] == med.intValue()) {
                // do nothing

            } else if (nums[i] > med.intValue()) {
                small = med;
                med = Integer.valueOf(nums[i]);
            } else if (small == null) {
                small = Integer.valueOf(nums[i]);
            } else if (nums[i] == small.intValue()) {
                // do nothing

            } else if (nums[i] >= small.intValue()) {
                small = Integer.valueOf(nums[i]);
            }
        }
        if (small == null) {
            return big.intValue();
        } else {
            return small.intValue();
        }

    }
}
