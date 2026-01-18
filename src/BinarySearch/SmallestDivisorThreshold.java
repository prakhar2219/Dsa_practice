package BinarySearch;

public class SmallestDivisorThreshold {
    static int findSum(int[] arr,int divisor){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int temp= (int) Math.ceil((double) arr[i]/divisor);
            sum=sum+temp;
        }
        return sum;
    }
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static  int smallestDivisor(int[] arr,int limit){
        int ans=0;
        int start=1;
        int end=maxElement(arr);
        while (start<=end){
            int mid=start+(end-start)/2;
            int sum=findSum(arr,mid);
            if (sum<=limit){
                ans=mid;
                end=mid-1;

            }else {
                start=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={8,4,2,3};
        int limit=10;
        System.out.println(smallestDivisor(arr,limit));
    }
}
