/*
 * Copyright 2015, BlobCity iSolutions Private Limited
 */
package com.blobcity.db.api;

import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Interface for CRUD queries on stored-procedures and stuff.
 * 
 * @author Prikshit Kumar
 * @author Sanket Sarang
 */
public interface Db {
    
    /**
     * Method to check whether a record with given primary key exists in the table or not
     * 
     * @param table name of the table
     * @param pk primary key of the record
     * @return true if exists, false if not
     * @throws InternalAdapterException when something went wrong internally
     */
    public boolean contains(final String table, final String pk) throws InternalAdapterException;
    
    /**
     * execute a SQL query
     *
     * @param table: name of the table
     * @param sql: SQL query in string format
     * @return
     * @throws InternalAdapterException
     */
    public String executeSqlQuery(String table, String sql) throws InternalAdapterException;
    
    /**
     * Inserts provided data into the table if a record with the provided key is not already present
     * @param table the name of the table
     * @param insertData the row / document of data to inserts
     * @throws InternalAdapterException
     * 
     */
    public  void insert(final String table, final JSONObject insertData) throws InternalAdapterException;
    
    /**
     * Method to invoke a stored procedure on the server
     * 
     * @param <U> Return Class of the stored procedure
     * @param procedureName name of procedure to be executed
     * @param returnClass class of return type of procedure
     * @param params parameter to the procedure
     * @return return the result received on execution of procedure
     * @throws InternalAdapterException
     */
    public <U extends Object> U invokeProcedure(final String procedureName, final Class<U> returnClass, final Object... params) throws InternalAdapterException;
    
    /**
     * Gets the JSON document corresponding to the requested key
     * 
     * @param table the table name
     * @param pk the primary key corresponding to the record to fetch
     * @return the record as a {@link JSONObject} if found; null otherwise
     * @throws InternalAdapterException
     */
    public JSONObject load(final String table, final String pk)  throws InternalAdapterException;
    
    /**
     * Removes data corresponding to the specified primary key from the table if corresponding record is found, else is
     * a no-op
     * @param table the name of the table
     * @param pk the primary key of the row / document to remove
     * @throws InternalAdapterException
     */
    public void remove(final String table, final String pk) throws InternalAdapterException;
    
    /**
     * Method to get the data of a table filtered through a user-provided filter
     *
     * @param table name of table
     * @param filterName name of filter
     * @param params arguments to load function of the filter
     * @return Iterator to list of primary keys of data filtered through the given filter
     * @throws InternalAdapterException
     */
    public Iterator<String> runFilter(final String table, final String filterName, final Object... params) throws InternalAdapterException;

    /**
     * Method for selecting all the data in a table
     * 
     * @param table the name of the table
     * @return iterator of the list of keys of all data in the table
     * @throws InternalAdapterException
     */
    public Iterator<Object> selectAll(final String table) throws InternalAdapterException;
    
    /**
     * Method for selecting all the data in a table in certain cols
     * 
     * @param table the name of the table
     * @param colsToSelect
     * @return iterator of the list of keys of all data in the table
     * @throws InternalAdapterException
     */
    public Iterator<Object> selectAllFromCols(final String table, final List<String> colsToSelect) throws InternalAdapterException;
    
    /**
     * Method for searching thru a table using a specified where clause.
     * eg. for sql string select `col1` from `TestTable` where `col3` < 30 and `col4` = "test"
     * eg. colsToSelect.add("col1");
     * operator can be "LT", "LTEQ", "GT", GTEQ", "EQ", "NEQ", "IN", "NOT_IN"
     * whereParams[0].put("column", "col3");
     * whereParams[0].put("operator", "<");
     * whereParams[0].put("value", "30");
     * whereParams[1].put("operator", "and");
     * whereParams[2].put("column", "col4");
     * whereParams[2].put("operator","=");
     * whereParams[2].put("value","test");
     * search("TestTable", colsToSelect, whereParams);
     * @param table the name of the table
     * @param colsToSelect
     * @param whereParams
     * @return iterator of the list of keys of all data in the table
     * @throws InternalAdapterException
     */
    public Iterator<Object> search(final String table, final List<String> colsToSelect, List<JSONObject> whereParams) throws InternalAdapterException;
    
    /**
     * Method to get the data of a table filtered through a user-provided filter
     * 
     * @param table name of table
     * @return iterator to list of keys
     * @throws InternalAdapterException 
     */
    public Iterator<String> selectAllAsStream(String table) throws InternalAdapterException;

    /**
     * method for updating a record in the table
     * 
     * @param table name of the table
     * @param pk primary key of the record to be updated
     * @param updateData JSON object for the record with updated column values
     * @throws InternalAdapterException 
     */
    public void update(final String table, final String pk, final JSONObject updateData) throws InternalAdapterException;
}
