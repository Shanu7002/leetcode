import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int actualNum = nums[i];
            int actualTarget = target - actualNum;

            if (map.containsKey(actualTarget)) {
                return new int[]{ map.get(actualTarget), i };
            }

            map.put(actualNum, i);
        }
        
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}