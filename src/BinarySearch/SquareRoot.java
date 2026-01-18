package BinarySearch;

public class SquareRoot {
    static int root(int number){
        int start=0;
        int end=number;
        while (start<=end){
            int mid = start + (end - start) / 2;
            int temp=mid*mid;
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
        return end;
    }

    public static void main(String[] args) {
        System.out.println(root(83));
    }
}
