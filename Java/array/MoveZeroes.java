package array;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        // TODO: Use um ponteiro 'lastNonZeroFoundAt' para rastrear onde
        // colocar o próximo número diferente de zero.
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        // Esperado: {1, 3, 12, 0, 0}
        for (int n : nums) System.out.print(n + " ");
    }
}