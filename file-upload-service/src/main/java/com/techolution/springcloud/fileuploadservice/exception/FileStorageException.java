package com.techolution.springcloud.fileuploadservice.exception;

/**
 * @author Srinivasu
 * On: 3rd Sep 2018
 */
public class FileStorageException extends RuntimeException {

    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
