package com.blobcity.db.sp.adapter;

import org.json.JSONObject;

import java.util.List;

/**
 * Created by sanketsarang on 29/04/17.
 */
public interface Db {

    public JSONObject sql(final String sql) throws StoredProcedureException;

    public JSONObject insertJson(final String ds, final String collection, final List<JSONObject> jsonObjects) throws StoredProcedureException;

    public JSONObject insertXml(final String ds, final String collection, final List<String> xmls) throws StoredProcedureException;

    public JSONObject insertCsv(final String ds, final String collection, final List<String> columns, final List<String> records) throws StoredProcedureException;

    public JSONObject insertText(final String ds, final String collection, final List<String> records) throws StoredProcedureException;

    public JSONObject insertText(final String ds, final String collection, final List<String> records, final String dataInterpreter) throws StoredProcedureException;

    public void createDs(final String ds) throws StoredProcedureException;

    public void createCollection(final String ds, final String collection, final CollectionType collectionType) throws StoredProcedureException;

    public void dropDs(final String ds) throws StoredProcedureException;

    public void dropCollection(final String ds, final String collection) throws StoredProcedureException;

    public void tuncateDs(final String ds) throws StoredProcedureException;

    public void truncateCollection(final String ds, final String collection) throws StoredProcedureException;
 }
