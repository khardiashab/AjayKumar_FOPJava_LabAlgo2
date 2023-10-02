package com.traveler.denomination.exception;

import com.traveler.denomination.utils.ErrorCode;

public class InvalidInputException extends Exception {
    private ErrorCode errorCode;

    public InvalidInputException(ErrorCode invalidInput) {
        super("Enter the greater values from zero.");
        this.errorCode = invalidInput;
    }

     // Getter method for errorCode
     public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "InvalidInputExpection [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

}
