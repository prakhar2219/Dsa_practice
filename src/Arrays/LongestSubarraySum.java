package Arrays;

import java.util.Map;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int []arr={2,3,5,1,9};
        int maxCount=Integer.MIN_VALUE;
        int count=0;
       int  sum=10;
        int currSum=10;
        for (int i = 0; i < arr.length; i++) {
if (currSum-arr[i]>0)
{
    currSum=currSum-arr[i];
    count++;
} else if (currSum-arr[i]==0) {
    currSum=currSum-arr[i];
    count++;
    maxCount=Math.max(maxCount,count);
}else {
    maxCount=Math.max(maxCount,count);
    currSum=sum;
    count=0;
}

        }
        System.out.println(maxCount);
        }
    }

