package com.blobcity.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Use annotation to mark a class as a Trigger class. The class must implement an InsertTrigger, UpdateTrigger
 * or DeleteTrigger interface.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Trigger {
    public String name();
}
