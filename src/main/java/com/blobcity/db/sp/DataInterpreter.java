package com.blobcity.db.sp;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface DataInterpreter {

    /**
     * Passes the records that are going to be inserted before a soft commit of the insert
     * @param jsons the list of records that are requested to be inserted
     * @return the records that will be inserted instead of the records requested to be inserted
     */
    public List<JSONObject> interpret(final List<JSONObject> jsons);
}
