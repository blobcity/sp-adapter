package com.blobcity.db.sp;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface DeleteTrigger {

    /**
     * Called before a delete operation is performed. The function must return a {@code true} or an {@code false} value.
     * A return of {@code true} indicates that the transaction will proceed further, while a value of {@code false}
     * will cause the transaction to cancel / roll-back
     * @param ds name of datastore
     * @param collection name of collection
     * @param jsons list of records that will be deleted post operation completion
     * @return {@code true} if transaction should proceed further and {@code false} to roll-back the transaction
     */
    public boolean preDelete(final String ds, final String collection, final List<JSONObject> jsons);

    /**
     * Called after a delete operation is performed. The success or failure in execution of this function does not
     * affect the outcome of the delete operation
     * @param ds name of datastore
     * @param collection name of collection
     * @param jsons list of records that were deleted
     */
    public void postDelete(final String ds, final String collection, final List<JSONObject> jsons);
}
