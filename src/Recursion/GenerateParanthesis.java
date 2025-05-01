package Recursion;

public class GenerateParanthesis {
 static void validParanthesis(String processed, int opening, int closing, int n){
        if (opening>n){
            return;
        }
        if (processed.length()==n*2){
            System.out.println(processed);
        }
        if (closing>opening){
            return;
        }
        validParanthesis(processed+'(',opening+1,closing,n);
        validParanthesis(processed+')',opening,closing+1,n);
    }

    public static void main(String[] args) {
        validParanthesis("",0,0,3);
    }
}
