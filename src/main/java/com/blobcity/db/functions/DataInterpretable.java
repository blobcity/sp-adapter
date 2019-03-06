/*
 * Copyright 2016, BlobCity iSolutions Private Limited
 */
package db.functions;

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
}
