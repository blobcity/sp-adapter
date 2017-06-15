package com.blobcity.db.sp;

import org.json.JSONObject;

/**
 * Created by sanketsarang on 12/06/17.
 */
public interface RestWebService {

    public JSONObject get(final JSONObject requestParams);

    public JSONObject post(final JSONObject jsonBody, final JSONObject requestParams);

}
