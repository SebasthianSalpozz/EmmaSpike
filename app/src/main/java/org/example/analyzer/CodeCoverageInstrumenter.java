package org.example.analyzer;
import org.vladium.emma.instr.InstrProcessor;

public class CodeCoverageInstrumenter {

    public static void instrument(String classPath, String outDir) {
        InstrProcessor processor = InstrProcessor.create();
        processor.setInstrPath(new String[] { classPath }, true);
        processor.setOutMode(InstrProcessor.OutMode.OUT_MODE_COPY);
        processor.setInstrOutDir(outDir);
        processor.run();
    }
}
