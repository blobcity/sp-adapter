package com.blobcity.db.sp.export;

import org.json.JSONObject;

import java.util.UUID;

/**
 * @author sanketsarang
 */
public class JsonExport {

    private final String filename;
    private final JSONObject jsonData;

    public JsonExport(final String filename, final JSONObject jsonData) {
        this.filename = filename;
        this.jsonData = jsonData;
    }

    public JsonExport(final JSONObject jsonData) {
        this(UUID.randomUUID().toString() + ".json", jsonData);
    }

    public JsonExport() {
        this(UUID.randomUUID().toString() + ".json", new JSONObject());
    }

    public String getFilename() {
        return this.filename;
    }

    public JSONObject getJsonData() {
        return this.jsonData;
    }
}
