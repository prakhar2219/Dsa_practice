package TCS;

import java.util.Scanner;

public class EventTIcekt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String curr = (i < s.length() - 1) ? s.substring(i, i + 2) : s.substring(i);
            if (curr.equals("EF") || curr.equals("56")){
                i=i+1;
                continue;
            }
            if (s.charAt(i)=='G'){
                continue;
            }
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
