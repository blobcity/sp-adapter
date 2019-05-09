package com.blobcity.db.sp;

import com.blobcity.db.sp.adapter.StoredProcedureException;
import com.blobcity.db.sp.triggers.TriggerOutcome;
import org.json.JSONObject;

import java.util.List;

public interface InsertTrigger {

    /**
     * Called before an insert operation is performed on the collection on which this trigger is registered. The trigger
     * must return back with a boolean value. If the value returned is {@code true} the insert will proceed further
     * and if the value returned is {@code false} the insert transaction will be cancelled / rolled-back
     * @param jsons the records being inserted
     * @return {@link TriggerOutcome} with outcome of <code>true</code> if operation must proceed further, else with
     * outcome of <code>false</code>. An optional error message can be specified, which is returned to the invoking
     * user only in the event of a <code>false</code> outcome.
     */
    public TriggerOutcome preInsert(final List<JSONObject> jsons);

    /**
     * Invoked post insert with the list of objects that were just inserted. Success or failure in execution of this
     * transaction does not affect the insert operation.
     * @param jsons the records being inserted
     */
    public void postInsert(List<JSONObject> json);
}
