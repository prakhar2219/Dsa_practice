package Strings;

public class ReverseString {
   static void reverseString(String original){
        String result="";

        String trimmed=original.trim();
        int prev=trimmed.length();
        for (int i = trimmed.length()-1; i >=0 ; i--) {
            if (trimmed.charAt(i)==' '){
                result=result+trimmed.substring(i,prev);
                prev=i;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        reverseString("my name is prakhar gupta");
    }
}
