package Strings;

public class StringRotations {
   static boolean rotated(String original,String match){
        int length = original.length();
        String newString=original;
        for (int i = 0; i < length; i++) {
            if (newString.equals(match)) return true;
            newString=newString.substring(length-2)+newString.substring(0,length-2);

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(rotated("abcd","cadb"));
    }
}
