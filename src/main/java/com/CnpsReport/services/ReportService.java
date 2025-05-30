package com.CnpsReport.services;

import net.sf.jasperreports.engine.JRException;

import java.util.List;

public interface ReportService {

    void generateRapport(String jasperFilePath,
                         List<?> mainData,
                         List<?> tableData,
                         String outputBasePath
    ) throws JRException;
}
