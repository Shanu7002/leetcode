package array;

import java.util.*;

public class TransactionAudit {

    public static List<Integer> findFrequentTransactions(int[] transactionIds, int threshold) {
        if (transactionIds == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        Map<Integer, Integer> counts = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : transactionIds) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }

        for (int i : counts.keySet()){
            if (counts.get(i) > threshold) {
                list.add(i);
            }
        }

        list.sort(null);
        return list;
    }

    public static void main(String[] args) {
        try {
            int[] transactions = {20, 20, 20, 10, 10, 10, 30, 30};
            int threshold = 2;

            System.out.println("Frequent Transactions: " + findFrequentTransactions(transactions, threshold));

            findFrequentTransactions(null, 0);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}