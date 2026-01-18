package Patterns;

public class AlphaHill {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        char temp=ch;
        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j >0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                 temp=(char)(ch+j);
                System.out.print(temp);
            }

            for (int j = i; j >0; j--) {
                System.out.print((char)(ch+j-1));
            }
            System.out.println();
        }
    }
}
