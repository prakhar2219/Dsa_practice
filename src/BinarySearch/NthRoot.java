package BinarySearch;

public class NthRoot {
    static int root(int number,int base){
        int start=0;
        int end=number;
        while (start<=end){
            int mid = start + (end - start) / 2;
            int temp= (int) Math.pow(base,mid);
            if (temp > number){
                end=mid-1;
            }
            if (temp < number){
                start=mid+1;
            }
            if (temp==number){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(root(69,4));
    }
}
