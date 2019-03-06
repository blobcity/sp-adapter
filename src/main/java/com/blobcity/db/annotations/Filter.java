/*
 *  Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a class that has one or more stored filters. Such a class must have at least one {@link Filter} defined.
 * 
 * @author Prikshit Kumar <prikshit.kumar@blobcity.com>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Filter {

    public String name() default "";
}

