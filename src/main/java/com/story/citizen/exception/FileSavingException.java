package com.story.citizen.exception;

public class FileSavingException extends RuntimeException {
    public FileSavingException() {
        super();
    }

    public FileSavingException(String message) {
        super(message);
    }

    public FileSavingException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileSavingException(Throwable cause) {
        super(cause);
    }

    protected FileSavingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
