package com.tim;

public class Configuration {

    private static final String OTEL_EXPORTER_OTLP_TRACES_ENDPOINT = "https://ingest.lightstep.com:443/traces/otlp/v0.9";
    private static final String OTEL_EXPORTER_OTLP_METRICS_ENDPOINT = "https://ingest.lightstep.com:443/metrics/otlp/v0.9";

    public static void setUpSystemVariables() {
        System.setProperty("otel.exporter.otlp.endpoint", OTEL_EXPORTER_OTLP_TRACES_ENDPOINT);
        System.setProperty("otel.exporter.otlp.metrics.endpoint", OTEL_EXPORTER_OTLP_METRICS_ENDPOINT);
    }
}
