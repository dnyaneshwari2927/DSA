import java.util.Arrays;

class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        // Sort the array in descending order
        Arrays.sort(nums);
        // Return the k-th largest element
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;
        int result = findKthLargest(arr, k);
        System.out.println(k + "th largest element is: " + result);
    }
}
