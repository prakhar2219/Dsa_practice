package BinarySearch;

public class ShipPackages {
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int totalSum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
    static int answer(int[] arr,int days){
        int start=maxElement(arr);
        int end=totalSum(arr);
        int ans=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            boolean isPossible=possible(arr,days,mid);
            if (isPossible){
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }
     static boolean possible(int[] arr, int days,int limit) {
        int sum=0;
        int count=0;
         for (int i = 0; i < arr.length; i++) {
             sum=sum+arr[i];
             if (sum>limit){
                 count++;
                 sum=0;
                 sum=arr[i];
             }
         }
         if (sum>0)count++;
         if (days>=count){
             return true;
         }
         return false;
    }

    public static void main(String[] args) {
        int weights[] = {5,4,5,2,3,4,5,6};
        int days = 5;
        System.out.println(answer(weights,days));
    }
}
