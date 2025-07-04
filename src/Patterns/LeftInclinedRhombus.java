package Patterns;

public class LeftInclinedRhombus {
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i%2==0) {
                    System.out.print("-");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i%2==0) {
                    System.out.print("-");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}
