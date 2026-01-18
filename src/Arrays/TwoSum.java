package Arrays;

import java.util.Arrays;

public class TwoSum {
    public void findPair(int[] arr,int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            int sum =arr[i]+arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                System.out.println("elements are at the position"+ i + " and " + j);
                return;
            }
        }
        System.out.println("No pair found.");


    }
}
