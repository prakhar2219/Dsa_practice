package TCS;

import java.util.Scanner;

public class Binary_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        StringBuilder s=new StringBuilder();
        while (num!=1){
            s.append(num%2);
            num=num/2;
        }
        s.append('1');
        s.reverse();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='0'){
                s.setCharAt(i, '1');
            }else{
                s.setCharAt(i, '0');
            }
        }
        System.out.println(s);
        int newDecimal=0;
        for (int i = 0; i < s.length(); i++) {
            newDecimal+=(s.charAt(s.length()-i-1)-'0')*(Math.pow(2,i));
        }
        System.out.print(newDecimal);
    }
}
