/*
 * Copyright 2016, BlobCity iSolutions Private Limited
 */
package com.blobcity.db.sp.interpreter;

import org.json.JSONObject;

/**
 *
 * @author Sanket Sarang
 */
public interface DataInterpretable {

    /**
     * Takes data in string format and converts to JSON which can be interpreted by the database.
     *
     * @param dataString Any string of data that needs to be converted to a structured JSON counter part
     * @return a (@link JSONObject} representation of a structured equivalent of the passed string; empty
     * {@link JSONObject} if input string cannot be parsed / recognized
     */
    public JSONObject interpret(final String dataString);

    /**
     * Invoked if the data to the interpeter is being fed by a file watch service. Used to track file level events
     * on the interpreter
     * @param eventType type of event
     * @param filePath path to file related to this event
     */
    public void onEvent(final InterpreterEventType eventType, final String filePath);
}
