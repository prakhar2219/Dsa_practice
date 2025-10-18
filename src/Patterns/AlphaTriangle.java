package Patterns;

public class AlphaTriangle {
    public static void main(String[] args) {
        int n=5;
        char ch='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(((char)(ch+(n-1)-i+j)));
            }
            System.out.println();
        }
    }
}
