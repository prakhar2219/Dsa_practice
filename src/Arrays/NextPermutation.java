package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    private static void nextPermutation(int[] nums) {
      int pivot=-1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if (nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if (pivot==-1){
            reverse(nums,0, nums.length-1);
            return;
        }
        for (int i = nums.length-1;i>pivot; i--) {
            if (nums[i]>nums[pivot]){
                int temp=nums[i];
                nums[i]=nums[pivot];
                nums[pivot]=temp;
                break;
            }
        }
        reverse(nums,pivot + 1,nums.length - 1);
    }
    private static int [] reverse(int[] nums,int start,int end) {
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}
