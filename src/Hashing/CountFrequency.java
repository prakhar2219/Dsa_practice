package Hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minKey = 0, maxKey = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value < min) {
                min = value;
                minKey = key;
            }
            if (value > max) {
                max = value;
                maxKey = key;
            }
        }
        System.out.println("Frequency Map: " + map);
        System.out.println("Element with Min Frequency: " + minKey + " → " + min);
        System.out.println("Element with Max Frequency: " + maxKey + " → " + max);
    }
}
