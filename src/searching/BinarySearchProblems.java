package searching;

/**
 * Binary Search & Rotated Array Problems (LeetCode / GeeksforGeeks)
 * Author: Santhosh Bussa
 */
public class BinarySearchProblems {

    /**
     * 1. Search in Rotated Sorted Array (LeetCode #33)
     * Time Complexity: O(log N), Space Complexity: O(1)
     */
    public static int searchRotated(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;

            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    /**
     * 2. Find Minimum in Rotated Sorted Array (LeetCode #153)
     * Time Complexity: O(log N), Space Complexity: O(1)
     */
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }

    /**
     * 3. Peak Element in Array (LeetCode #162)
     * Time Complexity: O(log N), Space Complexity: O(1)
     */
    public static int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
