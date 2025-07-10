package Arrays;

import java.util.Arrays;

public class LeftRotate {
    static void Rightrotate(int[] arr){
        int prev=0,curr=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==0){
                prev=arr[0];
                arr[i]=arr[arr.length-1];
            }else {
                curr=arr[i];
                arr[i] = prev;
                prev=curr;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void reverse(int[] arr,int start,int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void rotateLeft(int[] arr,int k){
        int n = arr.length;
        k = k % n;
reverse(arr,0,k-1);
reverse(arr,k,n-1);
reverse(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        rotateLeft(arr,k);
    }
}
