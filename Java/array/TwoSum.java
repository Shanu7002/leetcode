package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findSumIndices(int[] nums, int target) {
        // value, index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int actualNumber = nums[i];
            int actualTarget = target - actualNumber;

            if (map.containsKey(actualTarget)) {
                return new int[]{ map.get(actualTarget), i };
            }

            map.put(actualNumber, i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] result = findSumIndices(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if (result != null) {
            System.out.println(result[0] + " " + result[1]);
        }
    }
}