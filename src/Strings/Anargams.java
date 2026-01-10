package Strings;

import java.util.HashMap;

public class Anargams {
//    public boolean isAnagram(String s, String t) {
//        int originalLength = s.length();
//        int anargamLength = t.length();
//        if (originalLength != anargamLength) return false;
//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < originalLength; i++) {
//            char ch = s.charAt(i);
//            if (map.containsKey(ch)) {
//                map.put(ch, map.get(ch) + 1);
//
//            } else {
//                map.put(ch, 1);
//            }
//        }
//        for (int i = 0; i < originalLength; i++) {
//            char ch = t.charAt(i);
//            if (!map.containsKey(ch)) {
//                return false;
//            } else {
//                map.put(ch, map.get(ch) - 1);
//                if (map.get(ch) < 0) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
    }
