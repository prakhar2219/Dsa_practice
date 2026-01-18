package BinarySearch;

public class LastOccurence {
    static int lastIndex(int [] arr,int target){
        int start=0;
        int end= arr.length;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (target==arr[mid]){
               ans=mid;
               start=mid+1;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={3,4,13,13,13,13,13,20,40};
        System.out.println(lastIndex(arr,13));
    }
}
