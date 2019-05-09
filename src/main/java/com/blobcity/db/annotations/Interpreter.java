/*
 * Copyright 2016, BlobCity iSolutions Private Limited
 */
package com.blobcity.db.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate a class that is a data interpreter for interpreting custom import formats
 * 
 * @author Sanket Sarang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Interpreter {

    public String name() default "";
}
