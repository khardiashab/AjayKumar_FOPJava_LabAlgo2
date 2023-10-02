package com.traveler.denomination.exception;

import com.traveler.denomination.utils.ErrorCode;

public class CustomInputMismatchException extends RuntimeException {
    private ErrorCode errorCode;

    public CustomInputMismatchException(ErrorCode customInputMismatch, Throwable cause) {
        super("Enter the valid values in input!!!", cause);
        this.errorCode = customInputMismatch;
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "CustomInputMismatchException [errorCode=" + getErrorCode() + "]: " + getMessage();
    }
}