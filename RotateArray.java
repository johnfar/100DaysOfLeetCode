public class RotateArray {
    public void rotate(int[] nums, int k) {

        if (nums.length < 2) {
            // Do Nothing the Array is only one element
        } else if (nums.length < k) {
            // Check to see if k is larger then the array and update k to k mod array
            // length.
            int new_k = k % nums.length;
            createArray(nums, new_k);

        } else {
            // Run process with no modifications to k
            createArray(nums, k);
        }

    }

    public static int[] createArray(int[] array, int k) {
        int newArrayPosition = 0;
        int start = array.length - k;
        int newArray[] = new int[array.length];
        for (int i = start; i < array.length; i++) {
            newArray[newArrayPosition] = array[i];
            newArrayPosition = newArrayPosition + 1;
        }
        for (int i = 0; i < start; i++) {
            newArray[newArrayPosition] = array[i];
            newArrayPosition = newArrayPosition + 1;
        }

        for (int l = 0; l < newArray.length; l++) {
            array[l] = newArray[l];
        }
        return array;
    }
}
