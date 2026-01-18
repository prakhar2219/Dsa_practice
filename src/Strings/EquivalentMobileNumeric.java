package Strings;

public class EquivalentMobileNumeric {
    public static void main(String[] args) {
        String[] str
                = { "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999" };
        String s="doek";
        StringBuffer sb=new StringBuffer("");
        for (int i = 0; i < s.length(); i++) {
            char ch =s.charAt(i);
            if (ch==' '){
sb.append(" ");
            }else {
                sb.append(str[ch-'a']);
            }
        }
        System.out.println(sb.toString());
    }
}
