package BinarySearch;

public class MonkeyBanana {
    static int numberHours(int[] arr,int target){
        int start=1;
        int end=maxElement(arr);
        while (start<=end){
            int mid=start+(end-start)/2;
            int hoursSum =calculateHours(arr,mid);
            if (hoursSum >target){
                start=mid+1;
            }
            if (hoursSum <target){
                end=mid-1;
            }
            if (hoursSum ==target){
                return mid;
            }
        }
        return -1;
    }

    private static int calculateHours(int[] arr, int mid) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum= (int) (sum+(Math.ceil((double) arr[i] /mid)));
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

    public static void main(String[] args) {
       int[] a = {25, 12, 8, 14, 19};
       int h = 5;
        System.out.println(numberHours(a,h));
    }
}
