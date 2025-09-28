package algorithms;

public class insertionsort1 {
    public static int[] InsertionSort(int[] nums) {
        int n = nums.length;
        int sortedUntil = 0;
        while (sortedUntil < n) {
            int target = nums[sortedUntil+1];
            for (int j = 0; j < sortedUntil; j++) {
                if (target < nums[j]) {
                    // Insert into the place 
                    //sortedUntil++;
                    // Shift all remains by 1
                    for (int k = j; k < sortedUntil; k++) {
                        int tmp = nums[k];
                        nums[k] = nums[k+1];
                        nums[k+1] = tmp;
                    }
                }
            }
            sortedUntil++;
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
        int[] nums = new int[] {7, 2, 9, 5, 1, 4, 3, 6, 0, 8};
        displayArray(nums);
        System.out.println("");
        displayArray(InsertionSort(nums));
    }
}
