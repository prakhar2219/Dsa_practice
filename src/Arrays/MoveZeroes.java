package Arrays;

import java.util.Arrays;

public class MoveZeroes {
    static void move(int[] arr){
        int j=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                j=i;
                break;
            }
        }
        if (j==-1) return;
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,3,4,0,5,6,0,7};

        move(arr);
    }
}
