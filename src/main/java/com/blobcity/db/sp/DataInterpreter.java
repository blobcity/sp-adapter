package com.blobcity.db.sp;

import org.json.JSONObject;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface DataInterpreter {

    public JSONObject interpret(final JSONObject json);
}
