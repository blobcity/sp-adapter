/*
 * Copyright 2014 - 2015, BlobCity iSolutions Pvt. Ltd.
 */
package db.api;

/**
 * Exception to throw if something internally happened in the server-side adapter
 * 
 * @author Prikshit Kumar <prikshit.kumar@blobcity.com>
 */
public class InternalAdapterException extends Exception {

    private static final long serialVersionUID = -5547089196123687729L;

    public InternalAdapterException(final String message) {
        super(message);
    }
}
