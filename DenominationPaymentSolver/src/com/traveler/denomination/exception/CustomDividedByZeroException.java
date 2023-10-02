/**
 * The CustomDividedByZeroException class is a custom exception that extends the RuntimeException class.
 * It is thrown when a division by zero operation is attempted.
 * 
 * This exception class includes an ErrorCode object to provide information about the error code associated with the exception.
 * 
 * Example usage:
 * 
 * try {
 *     // Perform division operation
 * } catch (CustomDividedByZeroException ex) {
 *     // Handle exception
 * }
 */
package com.traveler.denomination.exception;

import com.traveler.denomination.utils.ErrorCode;

public class CustomDividedByZeroException extends RuntimeException {
    private ErrorCode errorCode;

    /**
     * Constructs a new CustomDividedByZeroException object with the specified error code and cause.
     * 
     * @param errorCode the ErrorCode object representing the error code associated with the exception
     * @param cause the Throwable object that caused this exception to be thrown
     */
    public CustomDividedByZeroException(ErrorCode errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    /**
     * Retrieves the error code associated with this exception.
     * 
     * @return the error code as an integer
     */
    public int getErrorCode() {
        return errorCode.getCode();
    }

    /**
     * Overrides the toString() method to provide a custom string representation of the exception.
     * 
     * @return a string representation of the CustomDividedByZeroException object
     */
    @Override
    public String toString() {
        return "CustomDividedByZeroException [errorCode=" + getErrorCode() + "] : " + getMessage();
    }
}