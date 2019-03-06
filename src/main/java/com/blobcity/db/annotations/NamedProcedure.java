/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.blobcity.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a procedure so that it can be represented by a name that is used to invoke it externally from a query. The procedure name must not be used
 * for invoking a procedure from within other procedures of the database or from within triggers and filters
 *
 * @author Sanket Sarang <sanket@blobcity.net>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NamedProcedure {

    public String name();
}
