package com.blobcity.db.sp;

import com.blobcity.db.sp.adapter.StoredProcedureException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface InsertTrigger {

    /**
     * Called before an insert operation is performed on the collection on which this trigger is registered. The trigger
     * must return back with a boolean value. If the value returned is {@code true} the insert will proceed further
     * and if the value returned is {@code false} the insert transaction will be cancelled / rolled-back
     * @param ds name of datastore
     * @param collection name of collection
     * @param jsons the records being inserted
     * @return {@code true} if the transaction should proceed further, and {@code false} if the transaction is to be
     * rolled-back.
     */
    public boolean preInsert(final String ds, final String collection, final List<JSONObject> jsons);

    /**
     * Invoked post insert with the list of objects that were just inserted. Success or failure in execution of this
     * transaction does not affect the insert operation.
     * @param ds name of datastore
     * @param collection name of collection
     * @param jsons the records being inserted
     */
    public void postInsert(final String ds, final String collection, List<JSONObject> json);
}
