package org.example;

import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    public String getGreeting(String name) {
        return "Hello " + name + ", from Provider Service!";
    }
    public int addNumbers(int a, int b) {
        return a + b;
    }
    public String getStatus() {
        return "Provider Service is up and running!";
    }
}

