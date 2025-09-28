package algorithms;

public class selectionsort {
    public static int[] SelectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // tmp min to the first unordered element
            int min_index = i;

            for (int j = i; j < n; j++) {
                if (nums[j] < nums[min_index]) {
                    min_index = j;  // if there is a minimum value, update the index
                }
            }
            // exchange min and the bound
            int tmp = nums[i];
            nums[i] = nums[min_index];
            nums[min_index] = tmp;
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
        displayArray(SelectionSort(nums));
    }
}
