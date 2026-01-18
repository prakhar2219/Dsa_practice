package Arrays;

public class RemoveDuplicates {
    void removeDup(int[] arr,int length){
        int[] result =new int[length];
        int k=0;
        result[k++]=arr[0];
        for (int i = 0; i < length-1; i++) {
            if(arr[i]==arr[i+1]){continue;}
            else {
                result[k++]=arr[i+1];
            }
        }
        for (int i = 0; i <length; i++) {
            System.out.println(result[i]);
        }
    }
}
