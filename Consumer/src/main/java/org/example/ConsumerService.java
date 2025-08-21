package org.example;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

    private final RestTemplate restTemplate;

    public ConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private final String providerBaseUrl = "http://localhost:8081/api/provider";

    public String fetchGreeting(String name) {
        return restTemplate.getForObject(providerBaseUrl + "/greet/" + name, String.class);
    }

    public int fetchAddition(int a, int b) {
        return restTemplate.getForObject(providerBaseUrl + "/add?a=" + a + "&b=" + b, Integer.class);
    }

    public String fetchStatus() {
        return restTemplate.getForObject(providerBaseUrl + "/status", String.class);
    }
}

