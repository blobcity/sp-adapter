/*
 * Copyright 2014, BlobCity iSolutions Pvt. Ltd.
 */
package com.blobcity.db.functions;

import org.json.JSONObject;

/**
 * Triggers that executes on a DML operation on the specific table. The template must belong to a BlobCityEntity for the
 * trigger to be successfully loaded.
 *
 * @author Sanket Sarang <sanket@blobcity.net>
 * @author Prikshit Kumar <prikshit.kumar@blobcity.com>
 */
public interface Triggerable {
    
    /**
     * Called after a new record is inserted.
     *
     * @param newMap The newly inserted object of type of the entity class on which the trigger applies.
     * @throws TriggerException Implementation should manually throw this exception to report error for rolling back the
     * insert operation and the entire transaction if the call is within a transaction.
     */
    public void afterInsert(JSONObject newMap) throws TriggerException;
    
    /**
     * Called before a record is inserted.
     *
     * @param newMap The object that will be newly inserted.
     * @throws TriggerException Implementation should manually throw this exception to report error for canceling the
     * insert operation and roll-backing an on going transaction if the call is within a transaction.
     */
    public void beforeInsert(JSONObject newMap) throws TriggerException;
    
    /**
     * Called after a record is updated.
     *
     * @param oldMap The old copy (before update) of the object of type of the entity class on which the trigger
     * applies.
     * @param newMap The new copy (post update) of the object of type of the entity class on which the trigger
     * applies.
     * @throws TriggerException Implementation should manually throw this exception to report error for rolling back the
     * update operation and the entire transaction if the call is within a transaction.
     */
    public void afterUpdate(JSONObject oldMap, JSONObject newMap) throws TriggerException;
    
    /**
     * Called before a record is updated.
     *
     *  @param oldMap The old copy (before update) of the object of type of the entity class on which the trigger
     * applies.
     * @param newMap The new copy (post update) of the object of type of the entity class on which the trigger
     * applies.
     * @throws TriggerException Implementation should manually throw this exception to report error for canceling the
     * update operation and roll-backing an on going transaction if the call is within a transaction.
     */
    public void beforeUpdate(JSONObject oldMap, JSONObject newMap) throws TriggerException;
    
    /**
     * Called when a record is deleted.
     *
     * @param oldMap The copy of the object of type of the entity class which was just removed.
     * @throws TriggerException Implementation should manually throw this exception to report error for rolling back the
     * delete operation and the entire transaction if the call is within a transaction.
     */
    public void afterDelete(JSONObject oldMap) throws TriggerException;
    
    /**
     * Called before a record is deleted
     *
     * @param oldMap The object that will be deleted
     * @throws TriggerException Implementation should manually throw this exception to report error for canceling the
     * delete operation and roll-backing an on going transaction if the call is within a transaction.
     */
    public void beforeDelete(JSONObject oldMap) throws TriggerException;
    
}
