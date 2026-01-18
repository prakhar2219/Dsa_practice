package Arrays;

import java.util.Arrays;

public class secondLargest {
    void secondLar(int[]a,int length){
//         Arrays.sort(a);
//       int  secondLargestElement=a[length-2];
//        System.out.println(secondLargestElement);
        // Approach -2
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]>smallest && a[i]<secondSmallest){
                secondSmallest=a[i];
            }
            if(a[i]>largest){
                secondLargest =largest;
                largest=a[i];
            } else if (a[i]<largest && a[i]> secondLargest) {
                secondLargest=a[i];
            }

        }
        System.out.println(secondSmallest);
        System.out.println(secondLargest);
    }
}
