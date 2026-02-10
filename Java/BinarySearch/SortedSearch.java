package BinarySearch;

public class SortedSearch {
    public static int findIndex(int[] sortedArray, int target) {
        if (sortedArray == null) return -1;

        int left = 0;
        int right = sortedArray.length - 1;

        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == target) {
                return mid;
            }
            if (sortedArray[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = { 1, 3, 5, 7, 9, 11 };
        System.out.println(findIndex(sortedArray, 1));
        System.out.println(findIndex(sortedArray, 3));
        System.out.println(findIndex(sortedArray, 5));
        System.out.println(findIndex(sortedArray, 7));
        System.out.println(findIndex(sortedArray, 9));
        System.out.println(findIndex(sortedArray, 11));
        System.out.println(findIndex(sortedArray, 8));
    }
}