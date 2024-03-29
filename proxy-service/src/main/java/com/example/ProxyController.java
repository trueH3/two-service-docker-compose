package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
public class ProxyController {

    @Value("${baseurl}")
    private String baseUrl;

    @GetMapping
    public String hello() throws URISyntaxException {
        final var restTemplate = new RestTemplate();

        return restTemplate.getForObject(new URI(baseUrl + "/test"), String.class);
    }
}
