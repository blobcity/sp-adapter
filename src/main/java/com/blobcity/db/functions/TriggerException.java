/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.blobcity.db.functions;

/**
 * Throw if an error is to be reported from the trigger. This will rollback the DML operation that invoked the trigger
 * in onInsert, onUpdate and onRemove trigger functions, and will prevent the DML from happening when thrown from
 * beforeInsert, beforeUpdate and beforeDelete trigger functions. The error code is reported to the application that
 * fired the query as is for the application to be able to handle the error appropriately.
 *
 * @author Sanket Sarang <sanket@blobcity.net>
 */
public class TriggerException extends Exception {
    private final String errorCode;
    
    public TriggerException() {
        errorCode = "NAN";
    }
    
    public TriggerException(final String errorCode) {
        this.errorCode = errorCode;
    }
    
    public TriggerException(final String message, final String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
    
    public TriggerException(final Throwable throwable) {
        super(throwable);
        this.errorCode = "NAN";
    }
    
    public TriggerException(final String message, final Throwable throwable) {
        super(message, throwable);
        this.errorCode = "NAN";
    }
    
    public TriggerException(final String message, final Throwable throwable, final String errorCode) {
        super(message, throwable);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
