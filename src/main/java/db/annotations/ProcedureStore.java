/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a class that has one or more stored procedures. Such a class must have at least one {@link NamedProcedure} defined.
 *
 * @author Sanket Sarang <sanket@blobcity.net>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ProcedureStore {

    public String name();
}
