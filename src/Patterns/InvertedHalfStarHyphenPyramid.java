package Patterns;

public class InvertedHalfStarHyphenPyramid {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= 2*(i-1)-1; j++) {
                System.out.print(" ");
            }
            if(i!=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
