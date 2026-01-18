package Recursion;

public class BinaryStrings {
   static void printStrings(String processed,int n){
        if (processed.length()==n){
            System.out.println(processed);
            return;
        }
        printStrings(processed+"0",n);
        if (processed.isEmpty()||processed.charAt(processed.length()-1)!='1'){
            printStrings(processed+"1",n);
        }

    }

    public static void main(String[] args) {
        printStrings("",3);
    }
}
