package com.blobcity.db.sp;

/**
 * Created by sanketsarang on 30/04/17.
 */
public interface StoredProcedure {

    /**
     * Invokes a stored procedure
     * @param obj the parameter for invoking the stored procedure
     * @return the response from the stored procedure. Must support {@code Object.toString()} if the procedure is being
     * invoked over a REST / CLI.
     */
    public Object invoke(Object obj);
}
