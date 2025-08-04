package twopointers;

public class TwoPointers {
    public static void main(String args[]) {
        int[] nums = new int[]{1, 0, 1, 2, 0};

        int i = 0, j = nums.length;
        int k = 0;
        while (i < j) {
            if(nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        for(int r=k;r<j;r++){
            nums[r] = 0;
        }
        for(int r=0;r<j;r++){
            System.out.print(nums[r]+" ");
        }
    }
}
