package com.blobcity.db.sp.adapter;

/**
 * Created by sanketsarang on 30/04/17.
 */
public enum CollectionType {
    ON_DISK("on-disk"),
    IN_MEMORY("in-memory"),
    IN_MEMORY_ND("in-memory-nd");

    private final String type;

    CollectionType(final String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
