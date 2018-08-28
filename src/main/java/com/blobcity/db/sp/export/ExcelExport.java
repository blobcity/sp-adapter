package com.blobcity.db.sp.export;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.UUID;

/**
 * Used to represent a single Excel export object
 * @author sanketsarang
 */
public class ExcelExport {
    private final String filename;
    private final Workbook excelWorkbook;

    public ExcelExport() {
        this(UUID.randomUUID().toString() + ".xlsx", new XSSFWorkbook());
    }

    public ExcelExport(final Workbook workbook) {
        this(UUID.randomUUID().toString() + ".xlsx", workbook);
    }

    public ExcelExport(final String filename) {
        this(filename, new XSSFWorkbook());
    }

    public ExcelExport(final String filename, final Workbook excelWorkbook) {
        this.filename = filename;
        this.excelWorkbook = excelWorkbook;
    }

    public Workbook getWorkbook() {
        return this.excelWorkbook;
    }

    public String getFilename() {
        return this.filename;
    }

}
