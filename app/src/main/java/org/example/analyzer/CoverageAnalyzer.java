package org.example.analyzer;

public class CoverageAnalyzer {

    public static void main(String[] args) {
        // Paso 1: Instrumentar clases
        CodeCoverageInstrumenter.instrument("build/classes/java/main", "build/instrumented_classes");

        // Paso 2: Ejecutar pruebas (ejecuta manualmente el comando de prueba)

        // Paso 3: Generar reporte de cobertura
        CodeCoverageReporter.generateReport("coverage.em", "build/reports/coverage-report.html");
    }
}
