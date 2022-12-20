public class BinarySearch {
    public int search(int[] nums, int target, int start, int end) {

        int mid = (start + end) / 2;
        if (start == end && nums[mid] != target) {
            return -1;
        }
        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            return search(nums, target, start, mid);
        } else {
            return search(nums, target, mid + 1, end);
        }
    }

    public int search(int[] nums, int target) {
        int end = nums.length - 1;
        if (nums == null || end + 1 == 0 || nums[0] > target || nums[end] < target) {
            return -1;
        }
        return search(nums, target, 0, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 3, 4, 6, 7 };
        int target = 6;
        BinarySearch binarySearch = new BinarySearch();
        int results = binarySearch.search(nums, target);
        System.out.println("Test");
        System.out.println(results);
    }

}
