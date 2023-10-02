package com.transactionapp.transaction;

public class Transaction {
    /**
     * This method checks if the target is achieved by summing up the elements in the array.
     * @param arr The array of integers
     * @param target The target value
     */
    public void checkTargetAchieved(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= target) {
                System.out.println(String.format("Target achieved after %d transactions", i + 1));
                return;
            }
        }
        System.out.println("Target is not achieved.");
    }
}