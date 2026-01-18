package SlidingWIndow;

public class MaximumConsecutiveOnes {
//    public int longestOnes(int[] nums, int k) {
//        int longest=0;
//        for (int i = 0; i < nums.length; i++) {
//            int count=0;
//            int j=i;
//            while (j < nums.length) {
//                if (nums[j] == 0) {
//                    if (count == k) break;
//                    count++;
//                }
//                j++;
//            }
//            int num=j-i;
//            longest=Math.max(num,longest);
//        }
//        return longest;
//    }

//    sliding window approach
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0;
        int maxLen = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }
}


