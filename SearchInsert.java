class SearchInsert {
    public int searchInsert(int[] nums, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target && nums[mid + 1] > target) {
            return mid + 1;
        } else if (nums[mid] > target && nums[mid + 1] > target) {
            return searchInsert(nums, target, start, mid);

        } else {
            return searchInsert(nums, target, mid + 1, end);
        }

    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (end + 1 == 0) {
            return 0;
        } else if (nums[end] < target) {
            return end + 1;

        }
        return searchInsert(nums, target, start, end);

    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 3, 4, 6, 7 };
        int target = 6;
        System.out.println("Hello");
        SearchInsert searchInsert = new SearchInsert();
        int results = searchInsert.searchInsert(nums, target);
        System.out.println("Test");
        System.out.println(results);

    }
}