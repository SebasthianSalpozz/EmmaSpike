package org.example.analyzer;

import com.vladium.emma.report.ReportProcessor;
  
public class CodeCoverageReporter {

    public static void generateReport(String dataFilePath, String outFilePath) {
        ReportProcessor processor = ReportProcessor.create();
        processor.setDataPath(new String[] { dataFilePath });
        processor.setReportTypes(new String[] { "html" });
        processor.setOutFile(outFilePath);
        processor.run();
    }
}
