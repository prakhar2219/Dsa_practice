package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        int count = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            boolean allMatch = true;
            for (int j = 0; j < strs.length; j++) {
                String s = strs[j];
                if (i >= strs[j].length() || s.charAt(i) != ch) {
                    allMatch = false;
                    break;
                }
            }
            if (!allMatch) break;
            count++;
        }
        if (count == 0) {
            return "";
        }
        return strs[0].substring(0, count);
    }
}
