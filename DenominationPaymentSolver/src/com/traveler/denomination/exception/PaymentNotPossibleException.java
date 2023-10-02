package com.traveler.denomination.exception;

import com.traveler.denomination.utils.ErrorCode;

// Custom exception class for "Not available" error
public class PaymentNotPossibleException extends Exception {
    private ErrorCode errorCode;

    // Constructor to set the error message
    public PaymentNotPossibleException(ErrorCode errorCode) {

        super("Payment is not possible with highest denomination.");
        this.errorCode = errorCode;
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "PaymentNotPossibleException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

    //
}