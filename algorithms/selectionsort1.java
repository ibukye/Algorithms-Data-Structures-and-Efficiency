package algorithms;

public class selectionsort1 {
    
    public static int[] SelectionSort(int[] nums) {
        int n = nums.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = i; j < n; j++) {
                int min = nums[i];
                int min_index = i;
                if (min > nums[j]) {
                    min = nums[j];
                    min_index = j;
                    swapped = true;
                }
                // Swap with the earlier one
                nums[min_index] = nums[i]; 
                nums[i] = min;
            }
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
        displayArray(SelectionSort(nums));
    }
}
