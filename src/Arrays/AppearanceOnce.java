package Arrays;

import java.util.HashMap;
import java.util.Map;

public class AppearanceOnce {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], !map.getOrDefault(arr[i], false));
        }
        for (Map.Entry<Integer, Boolean> entry : map.entrySet()) {
            if (entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }

    }
}
