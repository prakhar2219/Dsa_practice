package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] result = reverse(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int [] reverse(int[] arr) {
        int start=0,end=arr.length-1;
       while (start<end){
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       }
        return arr;
    }
}
