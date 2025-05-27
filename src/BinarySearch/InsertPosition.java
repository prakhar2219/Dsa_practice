package BinarySearch;

public class InsertPosition {
    static int lower(int [] arr,int target){
        int start=0;
        int end= arr.length;
        while (start<=end){
            int mid=(start+end)/2;
            if (target==arr[mid]){
                return mid;
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int [] arr={1,2,4,7};
        System.out.println(lower(arr,6));
    }
}
