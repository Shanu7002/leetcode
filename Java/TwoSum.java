import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findIndices(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentTarget = target - nums[i];
            int currentNum = nums[i];

            if(map.containsKey(currentTarget)){
                return new int[] { map.get(currentTarget), i };
            }
            map.put(currentNum, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findIndices(new int[] { 3, 1, 5, 7, 5, 9 }, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}