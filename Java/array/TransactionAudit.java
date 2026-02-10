package array;

import java.util.*;

public class TransactionAudit {

    public static List<Integer> findFrequentTransactions(int[] transactionIds, int threshold) {
        if (transactionIds == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        Map<Integer, Integer> counts = new HashMap<>();

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        try {
            int[] transactions = {10, 20, 10, 30, 20, 10, 40};
            int threshold = 2;

            System.out.println("Frequent Transactions: " + findFrequentTransactions(transactions, threshold));

            findFrequentTransactions(null, 0);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}