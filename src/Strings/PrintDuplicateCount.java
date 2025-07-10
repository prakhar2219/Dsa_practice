package Strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateCount {
    public void calculateDuplicates(String s){
        int count=0;
        HashMap<Character,Integer> freqCount=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freqCount.put(s.charAt(i), freqCount.getOrDefault(s.charAt(i),0)+1);
        }
        for (Map.Entry<Character,Integer> eachElement : freqCount.entrySet()){
            if (eachElement.getValue() > 1) {
                System.out.print("['" + eachElement.getKey() + "', " + eachElement.getValue() + "], ");
            }        }
    }


}
