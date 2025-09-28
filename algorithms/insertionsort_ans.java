package algorithms;

public class insertionsort_ans {
    public static int[] insertionSortPro(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            // temporary store the insertion value(target)
            int target = nums[i]; 
            int j = i - 1;

            // Shift by 1 while finding the place where to insert the target
            while (j >= 0 && nums[j] > target) {
                nums[j + 1] = nums[j]; // Shift operation
                j--;
                // In this case its not swapping 
                // replace the bigger elem to +1 place so that doesnt require swapping operation
            }
            // Insert the target into empty place
            nums[j + 1] = target; 
        }
        return nums;
    }

    public static void displayArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        //int[] nums = new int[] {7, 2, 9, 5, 1, 4, 3, 6, 0, 8};
        int[] nums = new int[] {5, 4, 2, 1, 6, 3};
        displayArray(nums);
        System.out.println("");
        displayArray(insertionSortPro(nums));
    }
}
