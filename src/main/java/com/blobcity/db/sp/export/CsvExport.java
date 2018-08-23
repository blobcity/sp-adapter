package com.blobcity.db.sp.export;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author sanketsarang
 */
public class CsvExport {
    private final String filename;
    private final List<String> csvRows;

    public CsvExport() {
        this(UUID.randomUUID().toString() + ".csv");
    }

    public CsvExport(final String filename) {
        this(filename, new ArrayList<String>());
    }

    public CsvExport(final String filename, final List<String> csvRows) {
        this.filename = filename;
        this.csvRows = csvRows;
    }

    public String getFilename() {
        return this.filename;
    }

    public List<String> getCsvRows() {
        return this.csvRows;
    }

    public void addHeaderRow(final String headerRow) {
        csvRows.add(0, headerRow);
    }

    public void addRowBottom(final String row) {
        csvRows.add(row);
    }

    public void addRowTop(final String row) {
        csvRows.add(0, row);
    }
}
