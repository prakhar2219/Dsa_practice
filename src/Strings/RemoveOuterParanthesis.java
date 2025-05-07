package Strings;

public class RemoveOuterParanthesis {
    static String removeParanthesis(String original){
        String result="";
        int count=0;

        for (int i = 0; i < original.length(); i++) {
            char ch=original.charAt(i);
            if (ch=='(' && count++>0){
                result+=ch;
            }
            if (ch==')' && count-- >1){
                result+=ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String st="(()())(())()";
        System.out.println(removeParanthesis(st));
    }
}
