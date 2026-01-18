package Strings;

public class LargestOddNumber {
    static boolean isOdd(char ch){
        int digit=ch-'0';
        if (digit %2 != 0){return true;}
        return false;
    }
    static String largestString(String original){
        String result="";
        String prevResult="";
        for (int i = 0; i < original.length(); i++) {
            char ch=original.charAt(i);
            if (isOdd(ch)){
                result+=ch;
            }
            else{
                if (Integer.parseInt(result)>Integer.parseInt(prevResult))
                {
                    prevResult=result;
                    result="";
                }
            }
        }
        if (Integer.parseInt(result)>Integer.parseInt(prevResult))
        {
        return result;
        }
        else return prevResult;
    }

    public static void main(String[] args) {
        System.out.println(largestString("52"));
    }
}
