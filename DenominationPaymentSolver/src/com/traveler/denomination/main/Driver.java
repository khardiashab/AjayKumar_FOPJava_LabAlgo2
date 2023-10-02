package com.traveler.denomination.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.traveler.denomination.exception.*;

import com.traveler.denomination.service.*;
import com.traveler.denomination.utils.ErrorCode;

public class Driver {
    /*
     * TestCase 1
     * 
     * enter the size of currency denominations
     * 3
     * enter the currency denominations value
     * 5
     * 1
     * 10
     * enter the amount you want to pay
     * 12
     * 
     * Your payment approach in order to give min no of notes will be
     * 10:1
     * 1:2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MergeSort mergeSort = new MergeSort();
        Payment payment = new Payment();
        try {
            try {
                System.out.println("Enter the number of currency denominations:");
                int numDenominations = scanner.nextInt();
                if (numDenominations <= 0) {
                    throw new InvalidInputException(ErrorCode.INVALID_INPUT);
                }

                int[] denominations = new int[numDenominations];
                System.out.println("Enter the values of currency denominations:");
                for (int i = 0; i < numDenominations; i++) {
                    int denominationValue = scanner.nextInt();
                    if (denominationValue <= 0) {
                        throw new InvalidInputException(ErrorCode.INVALID_INPUT);
                    }
                    denominations[i] = denominationValue;
                }

                // mergeSort.printArray(denominations);
                mergeSort.sort(denominations, 0, numDenominations - 1);
                // mergeSort.printArray(denominations);

                System.out.println("Enter the amount you want to pay:");
                int amount = scanner.nextInt();
                if (amount <= 0) {
                    throw new InvalidInputException(ErrorCode.INVALID_INPUT);
                }

                payment.payWithHighestDenomination(denominations, amount);
            } catch (InputMismatchException e) {
                throw new CustomInputMismatchException(ErrorCode.CUSTOM_INPUT_MISMATCH, e);
            }
        } catch (CustomIndexOutOfBondException e) {
            System.out.println(e);
        } catch (CustomDividedByZeroException e) {
            System.out.println(e);
        } catch (CustomInputMismatchException e) {
            System.out.println(e);
            System.out.println("-----------------------------------");
            System.out.println();
            System.out.println();
            System.out.println("           running again...");
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------------");
            main(args);
        } catch (PaymentNotPossibleException e) {
            System.out.println(e);
        } catch (InvalidInputException e) {
            System.out.println(e);
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}