package BinarySearch;

public class SortedSearch {
    public static int findIndex(int[] sortedArray, int target) {
        if (sortedArray == null) return -1;

        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 1, 3, 5, 7, 9, 11 };
        System.out.println(findIndex(sortedArray, 3)); // Esperado: 1
        System.out.println(findIndex(sortedArray, 8)); // Esperado: -1
    }
}