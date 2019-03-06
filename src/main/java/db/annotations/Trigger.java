/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate classes for triggers
 * 
 * @author Prikshit <prikshit.kumar@blobcity.com>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Trigger {

    public String table();
    public int sequence() default -1;
}