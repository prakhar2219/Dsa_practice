package Strings;

public class LongestRepeatingReplacement {
    public int characterReplacement(String s, int k) {
        int longest=0;
        for (int i = 0; i < s.length() - k; i++) {
            int count=0;
            int j=i;
            while (j < s.length()) {
                if (s.charAt(j) != s.charAt(i)) {
                    if (count == k) break;
                    count++;
                }
                j++;
            }
           int num=j-i;
           longest=Math.max(num,longest);
        }
        return longest;
    }
}
