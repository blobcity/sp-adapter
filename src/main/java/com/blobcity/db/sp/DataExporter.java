package com.blobcity.db.sp;

import com.blobcity.db.sp.export.CsvExport;
import com.blobcity.db.sp.export.ExcelExport;
import com.blobcity.db.sp.export.JsonExport;
import com.blobcity.db.sp.export.TextExport;

/**
 * Implementer gets the facility to export data from DB in the desired custom format
 *
 * @author sanketsarang
 */
public interface DataExporter {

    /**
     * Used to export desired data in CSV format. The response is a list of strings, where each record in the list must
     * correspond to one line in the CSV file. Each line must have the comma separated values. The first row maybe
     * @param param input parameter for the stored procedure in string format
     * @return the CSV response as a {@link CsvExport}
     */
    public CsvExport getAsCsv(final String param);

    /**
     * Used to export data in Excel format. The invoking client will actually receive an Excel file for download.
     * @param param input parameter in string format
     * @return the Excel export as {@link ExcelExport}
     */
    public ExcelExport getAsExcel(final String param);

    /**
     * Used to export data in text format. The invoking client will receive a text file with the contents as mentioned
     * in String response
     * @param param input parameter for the stored procedure in string format
     * @return the export value as {@link TextExport}
     */
    public TextExport getAsText(final String param);

    /**
     * Used to export data in json format. The invoking client will receive a file with the contents of the JSONObject
     * in string format put into the file
     * @param param input parameter for the stored procedure in string format
     * @return the export value as {@link JsonExport}
     */
    public JsonExport getAsJson(final String param);

}
