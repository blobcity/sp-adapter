package com.blobcity.db.sp;

import com.blobcity.db.sp.interpreter.InterpreterEventType;
import org.json.JSONObject;

import java.util.List;

/**
 * Data interpreters on BlobCity DB must implement this interface
 */
public interface Interpretable {

    /**
     * Passes the records that are going to be inserted before a soft commit of the insert
     * @param jsons the list of records that are requested to be inserted
     * @return the records that will be inserted instead of the records requested to be inserted
     */
    public List<JSONObject> interpret(final List<JSONObject> jsons);

    /**
     * Called when an event concerning the interpreter occurs, other than the interpret operation itself
     * @param eventType the type of event
     * @param filePath absolute location of file for which the event is reported
     */
    public void onEvent(final InterpreterEventType eventType, final String filePath);
}
