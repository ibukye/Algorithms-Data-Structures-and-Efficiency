package algorithms;

public class insertionsort {
    public static int[] InsertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            //int target = nums[i];
            // Look thorough the sorted from right to left
            int sortedUntil = i-1;
            for (int j = sortedUntil; j >= 0; j--) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                    //System.out.print(i + ": ");
                    //displayArray(nums);
                    //System.out.println("");
                } else{ break; }
            }
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
        displayArray(InsertionSort(nums));
    }
}
