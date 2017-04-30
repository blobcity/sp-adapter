package com.blobcity.db.sp;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface UpdateTrigger {

    /**
     * Called before an update operation is performed. The call must return back with {@code true} or {@code false}. A
     * value of {@code true} will make the transaction proceed further, while a value of {@code false} will cancel /
     * roll-back the update transaction.
     * @param ds name of datastore
     * @param collection name of collection
     * @param oldValues old values of records before update
     * @param newValues new values of records that will be set after update
     * @return {@code true} if the transaction is to proceed further; {@code false} if the transaction is to be cancelled
     * / rolled-back.
     */
    public boolean preUpdate(final String ds, final String collection, final List<JSONObject> oldValues, final List<JSONObject> newValues);

    /**
     * Called after an update operation is performed. Success or failure in execution of this function does not affect
     * the original update operation.
     * @param ds name of datastore
     * @param collection name of collection
     * @param oldValues old values of records
     * @param newValues new values of records
     */
    public void postUpdate(final String ds, final String collection, final List<JSONObject> oldValues, final List<JSONObject> newValues);
}
