package com.blobcity.db.sp.export;

import java.util.UUID;

/**
 * Created by sanketsarang on 23/08/18.
 */
public class TextExport {
    final String filename;
    final String text;

    public TextExport(final String text) {
        this.filename = UUID.randomUUID() + ".txt";
        this.text = text;
    }

    public TextExport(final String filename, final String text) {
        this.filename = filename;
        this.text = text;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getText() {
        return this.text;
    }
}
