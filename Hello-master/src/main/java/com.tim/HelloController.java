package com.tim;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("opentelemetry")
    public String openTelemetry() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.execute("http://localhost/0:0:0:0:0:0:0:1:4317", HttpMethod.GET, null, null, String.class);
    }
}
