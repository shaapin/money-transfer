package ru.astondevs.moneytransfer.exception;

public class InvalidPinException extends RuntimeException{
    public InvalidPinException(String message) {
        super(message);
    }
}
