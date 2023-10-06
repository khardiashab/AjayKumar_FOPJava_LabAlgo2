package com.traveler.denomination.service;

import com.traveler.denomination.exception.CustomDividedByZeroException;
import com.traveler.denomination.exception.PaymentNotPossibleException;
import com.traveler.denomination.utils.ErrorCode;


public class Payment {

    public void payWithHighestDenomination(int[] arr, int amount) throws PaymentNotPossibleException {
        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (amount == 0) {
                break;
            }

            if (arr[i] <= amount) {
                try {
                    count[i] = amount / arr[i];
                    amount -= arr[i] * count[i];
                } catch (ArithmeticException err) {
                    throw new CustomDividedByZeroException(ErrorCode.CUSTOM_DIVIDED_BY_ZERO, err);

                }
            } else {
                count[i] = 0;

            }
        }

        if (amount != 0) {
            throw new PaymentNotPossibleException(ErrorCode.PAYMENT_NOT_POSSIBLE);
        }

        printDenominationCount(arr, count);

    }

    private void printDenominationCount(int[] denominations, int[] count) {
        System.out.println("Your payment approach in order to give min no of notes will be: ");
        for (int i = 0; i < count.length; i++) {
            if(count[i] == 0) continue;
            System.out.println(String.format("%d: %d", denominations[i], count[i]));
        }
    }

}