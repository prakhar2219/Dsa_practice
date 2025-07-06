package Arrays;

public class sortedArrayCheck {
    boolean flag=false;
    void check(int[] arr,int length){
        for (int i = 0; i < length-1; i++) {
            if(arr[i]<arr[i+1] || arr[i]==arr[i+1]){
                flag=true;
                continue;
            }
            else{ flag=false;
            break;}
        }
        if (flag == true){
            System.out.println("sorted");
        }
        else {
            System.out.println("unsorted");
        }
    }
}
