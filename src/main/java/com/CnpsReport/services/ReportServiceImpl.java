package com.CnpsReport.services;

import lombok.extern.slf4j.Slf4j;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class ReportServiceImpl implements ReportService{


    @Override
    public void generateRapport(String jasperFilePath, List<?> mainData, List<?> tableData, String outputBasePath) throws JRException {

        JasperReport jasperReport = (JasperReport) JRLoader.loadObjectFromFile(jasperFilePath);

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(mainData);
        JRBeanCollectionDataSource tableDataSource = new JRBeanCollectionDataSource(tableData);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("TABLE_DATA_SOURCE", tableDataSource);
        log.info("demarrage du remplissage");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        log.info("fin du remplissage");

        JasperExportManager.exportReportToPdfFile(jasperPrint, outputBasePath + ".pdf");

        System.out.println("Rapport généré avec succès : " + outputBasePath);
    }
}
