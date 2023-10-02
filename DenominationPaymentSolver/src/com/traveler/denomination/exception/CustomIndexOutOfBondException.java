package com.traveler.denomination.exception;

import com.traveler.denomination.utils.ErrorCode;

public class CustomIndexOutOfBondException extends RuntimeException {
    private ErrorCode errorCode;

    public CustomIndexOutOfBondException(  ErrorCode errorCode, Throwable cause) {
        super (cause);
        this.errorCode = errorCode; 
    }

    // Getter method for errorCode
    public int getErrorCode() {
        return errorCode.getCode();
    }

    @Override
    public String toString() {
        return "CustomIndexOutOfBondException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }

    //
}
