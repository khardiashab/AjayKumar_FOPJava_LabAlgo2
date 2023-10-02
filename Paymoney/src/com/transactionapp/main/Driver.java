package com.transactionapp.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.transactionapp.exception.InvalidInputException;
import com.transactionapp.transaction.Transaction;

public class Driver {
    /**
     * Test Case 1
     *
     * Enter the size of the transaction array: 3
     * Enter the values of the array: 20 12 31
     * Enter the total number of targets that need to be achieved: 2
     * Enter the value of the target: 21
     * Target achieved after 2 transactions.
     * Enter the value of the target: 19
     * Target achieved after 1 transaction.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transaction transaction = new Transaction();

        try {
            System.out.println("Enter the size of the transaction array:");
            int size = sc.nextInt();
            if (size <= 0)
                throw new InvalidInputException();

            System.out.println("Enter the values of the array:");
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                int value = sc.nextInt();
                if (value <= 0)
                    throw new InvalidInputException();
                arr[i] = value;
            }

            System.out.println("Enter the total number of targets that need to be achieved:");
            int targets = sc.nextInt();
            if (targets <= 0)
                throw new InvalidInputException();

            while (targets-- > 0) {
                System.out.println("Enter the value of the target:");
                int target = sc.nextInt();
                if (target <= 0)
                    throw new InvalidInputException();
                transaction.checkTargetAchieved(arr, target);
                System.out.println();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer value.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        } finally {
            if(sc != null){
                sc.close();
            }
        }
    }
}