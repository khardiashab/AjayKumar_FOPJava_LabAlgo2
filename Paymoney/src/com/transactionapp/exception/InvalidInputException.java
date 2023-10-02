package com.transactionapp.exception;

public class InvalidInputException extends Exception{
    public InvalidInputException(){
        super("Exception: Enter the values greater than zero.");
    }
}
