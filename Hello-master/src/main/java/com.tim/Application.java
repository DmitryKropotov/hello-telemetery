package com.tim;

import com.lightstep.opentelemetry.launcher.OpenTelemetryConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {

    private static Logger log = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Configuration.setUpSystemVariables();
        OpenTelemetryConfiguration.newBuilder().setServiceName("http://localhost/0:0:0:0:0:0:0:1:4317").
        setAccessToken("vm7F7Xe69hDdCUOjV3CXVN4CFyksXuRAZ5sznBqllSVAyyWmQsIT8rxqkUN+IBJIzh/e9GyYHmMCyDaNkrwsFLezRZoU5f80S8DtgAZ9").
        buildOpenTelemetry();
        log.info("log");
    }
}
