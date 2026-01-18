package BinarySearch;

public class LowerBound {
    static int lower(int [] arr,int target){
        int start=0;
        int end= arr.length;
        while (start<=end){
            int mid=(start+end)/2;
            if (target==arr[mid]){
                return arr[mid];
            }
            if (target>arr[mid]){
                start=mid+1;
            }
            if (target<arr[mid]) {
                end=mid-1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int [] arr={3,2,5,7,8,15,20,22,26,35};
        System.out.println(lower(arr,21));
    }
}
