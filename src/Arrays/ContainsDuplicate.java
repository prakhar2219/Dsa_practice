package Arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(dupliacte(arr));
    }

    private static boolean dupliacte(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i],1);
        }
        return false;
    }
}
