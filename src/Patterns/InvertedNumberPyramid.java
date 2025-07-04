package Patterns;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        int count=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            count=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count++);
            }
            count--;
            for (int j = 2; j <= i; j++) {
                System.out.print(--count);
            }
            System.out.println();
        }
    }
}
