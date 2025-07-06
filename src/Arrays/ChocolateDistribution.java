package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ChocolateDistribution {
    public static void main(String[] args) {
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        int m=3;
        System.out.println(distribute(arr,m));
    }

    private static int distribute(int[] arr,int m) {
        Arrays.sort(arr);
        int minimumDifference=Integer.MAX_VALUE;
        for (int i = 0; i+m-1 < arr.length ; i++) {
            int difference=arr[i+m-1]-arr[i];
            minimumDifference=Math.min(difference,minimumDifference);
        }
        return minimumDifference;
    }
}
