package array;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int lastNomZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastNomZeroFoundAt] = nums[i];
                lastNomZeroFoundAt++;
            }
        }

        for (int i = lastNomZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int n : nums) System.out.print(n + " ");
        System.out.println(); // just for remove the %, IDE things, apparently.
    }
}