package BinarySearch;

public class CountOccurences {
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
    static int firstIndex(int [] arr,int target){
        int start=0;
        int end= arr.length;
        int ans=-1;
        while (start<=end){
            int mid=(start+end)/2;
            if (target==arr[mid]){
                ans=mid;
                end=mid-1;
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
        int first=firstIndex(arr,13);
        int second=lastIndex(arr,13);
        int occurence=second-first+1;
        System.out.println(occurence);
    }
}