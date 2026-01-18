package Arrays;

public class PairSum_rotated {
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={11, 15, 6, 8, 9,10};
        int target=16;
        int pivot=findPivot(arr);
        int left=(pivot+1)% arr.length;
        int right=pivot;
        while (left != right){
            if (arr[left]+arr[right]==target){
                System.out.println("pair found");
                break;
            } else if (arr[left]+arr[right]>target) {
                right= (right - 1 + arr.length) % arr.length;
            }else {
                left=(left+1)%arr.length;
            }
        }
    }
}
