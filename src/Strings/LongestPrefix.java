package Strings;

public class LongestPrefix {
String findPrefix(String[] original){
    String result="";
    char ch;
    for (int i = 0; i < original.length; i++) {


        for (int j = 0; j < original[i].length()-1; j++) {
            if (original[j].charAt(i)==original[j+1].charAt(i)){
                result+=original[j].charAt(i);
                continue;
            }
            else return "";
        }
    }
    return result;
}

    public static void main(String[] args) {
        LongestPrefix ob =new LongestPrefix();
        String[] st={"flower","flow","flight"};
        System.out.println(ob.findPrefix(st));


    }
}
