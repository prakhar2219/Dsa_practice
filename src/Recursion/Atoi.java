package Recursion;

public class Atoi {
    static int funcAtoi(String input,String processed){
        if (input.length()==0){
            return Integer.parseInt(processed);
        }
        char ch=input.charAt(0);
        if (ch=='+'||ch=='-'&& processed.isEmpty()){
            return funcAtoi(input.substring(1),processed + ch );
        }
        if (Character.isDigit(ch)){
            return funcAtoi(input.substring(1),processed + ch);
        }
        else {
            return Integer.parseInt(processed);
        }
    }

    public static void main(String[] args) {
        System.out.println(funcAtoi("-123",""));
    }
}
