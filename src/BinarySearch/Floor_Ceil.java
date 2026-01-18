package BinarySearch;

public class Floor_Ceil {
    static int ceil(int [] arr,int target){
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
    static int floor(int [] arr,int target){
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
        return arr[start-1];
    }


    public static void main(String[] args) {
        int [] arr={3,4,4,7,8,10};
        System.out.println(floor(arr,8));
        System.out.println(ceil(arr,8));
    }
}
