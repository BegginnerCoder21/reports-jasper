package com.CnpsReport;

import com.CnpsReport.utils.DataGenerateReport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CnpsReportApplication {


	public static void main(String[] args){
		//SpringApplication.run(CnpsReportApplication.class, args);

		DataGenerateReport.genericReport();
		//DataGenerateReport.bilanA();
		//DataGenerateReport.TAmort();
		//DataGenerateReport.TProv();
		//DataGenerateReport.TCreances();
		//DataGenerateReport.TDettes();
		//DataGenerateReport.TEngag();
		//DataGenerateReport.TEffectif();
		//DataGenerateReport.TResult();
		//DataGenerateReport.CR();
		//DataGenerateReport.TImmo();
		//DataGenerateReport.TCotis();
	}

}
