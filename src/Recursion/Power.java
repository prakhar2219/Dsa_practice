package Recursion;

public class Power {
    public static double calcPower(double x,int idx,int n){
        if (idx==n){
            return 1;
        }
        return x * calcPower(x,idx+1,n);
    }

    public static void main(String[] args) {
        System.out.println(calcPower(2.0,0,3));

    }
}
