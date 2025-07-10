package Strings;

public class RemoveConsecutiveCharacters {
    public String removeConsecutiveCharacter(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for (int i =1; i < s.length(); i++) {
            if (s.charAt(i)==s.charAt(i-1)){
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
