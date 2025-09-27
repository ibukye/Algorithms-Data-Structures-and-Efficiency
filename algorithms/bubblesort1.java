package algorithms;

public class bubblesort1 {
    
    public static int[] BubbleSort(int[] nums) {
        int i = 0;
        int count = 0;
        while (count < nums.length) {
            if (i<nums.length-1 && nums[i] > nums[i+1]) {
                int tmp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = tmp;
                count = 0;
            } else {
                count++;
            }
            i++;
            i %= nums.length;
        }
        return nums;
    }

    public static void displayArray(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            System.out.printf(String.valueOf(nums[i]) + " ");
        }
    }


    public static void main(String[] args) {
        int[] nums = new int[] {3,2,9,5,1,4};
        //boolean isSorted = false;
        displayArray(nums);
        System.out.println("");
        displayArray(BubbleSort(nums));
    }
}
