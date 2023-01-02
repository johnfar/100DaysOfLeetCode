import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // set variables for checking the position that is being reviewed in the array
        // and one for the last zero
        int position = 0;
        int zeroPosition = 0;
        // In the while loop iterate over the array only updating the zeroPosition if
        // the position is not a zero. Do a swap whenever the current position is not a
        // zero.
        while (position < nums.length) {
            if (nums[position] != 0) {
                nums[zeroPosition] = nums[position];
                zeroPosition = zeroPosition + 1;
            }
            position = position + 1;
        }
        // from the zeroPosition to the end of the array update it to be a zero.
        while (zeroPosition < nums.length) {
            nums[zeroPosition] = 0;
            zeroPosition = zeroPosition + 1;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 0, 6, 0, 7 };
        MoveZeroes ans = new MoveZeroes();
        ans.moveZeroes(array);

        System.out.println(Arrays.toString(array));
    }
}
