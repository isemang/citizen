package com.story.citizen.exception;

public class FileManageException extends RuntimeException {
    public FileManageException() {
        super();
    }

    public FileManageException(String message) {
        super(message);
    }

    public FileManageException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileManageException(Throwable cause) {
        super(cause);
    }

    protected FileManageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
