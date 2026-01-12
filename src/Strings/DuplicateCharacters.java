package Strings;

import java.util.HashMap;

public class DuplicateCharacters {
    public void printDuplicates(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Character ch: map.keySet()){
            if (map.get(ch)>1){
                System.out.print(""+ch+","+map.get(ch));
            }
        }
    }
}
