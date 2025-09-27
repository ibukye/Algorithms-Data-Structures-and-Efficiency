package algorithms;

/*
 * no need to iterate the whole array many times
 */

public class bubblesort {

    public static int[] BubbleSort(int[] nums) {
        int n = nums.length;
        boolean swapped=true;   // initialized to true
        
        for (int i = 0; i < n-1; i++) {
            swapped=false;

            for (int j = 0; j < n-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    swapped = true;
                }
            }
            // If there is no swap, that means the array is already sorted
            if (!swapped) { break; }
        }
        return nums;
    }

    public static void displayArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.printf(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {7, 2, 9, 5, 1, 4, 3, 6, 0, 8};
        displayArray(nums);
        System.out.println("");
        displayArray(BubbleSort(nums));
    }
}
