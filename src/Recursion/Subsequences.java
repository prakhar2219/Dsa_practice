package Recursion;

public class Subsequences {
    static void printSubsequences(String processed,String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        printSubsequences(processed+ch,unprocessed.substring(1));
        printSubsequences(processed,unprocessed.substring(1));

    }

    public static void main(String[] args) {
        printSubsequences("","abc");
    }
}
