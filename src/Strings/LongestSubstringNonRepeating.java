package Strings;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubstringNonRepeating {
//    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        for (int i = 0; i < s.length(); i++) {
//            HashMap<Character, Integer> map = new HashMap<>();
//            int count = 0;
//            for (int j = i; j < s.length(); j++) {
//                if (map.containsKey(s.charAt(j))) {
//                    break;
//                } else {
//                    map.put(s.charAt(j), 1);
//                    count++;
//                }
//            }
//            maxLength = Math.max(count, maxLength);
//        }
//        return maxLength;
//    }

    //    sliding window approach
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0, end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (; start < s.length() && end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            map.put(s.charAt(end), end);
            maxLength = Math.max(end - start + 1, maxLength);
        }
        return maxLength;
    }
}
