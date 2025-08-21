package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provider")
public class ProviderServiceController {

    private final ProviderService providerService;

    public ProviderServiceController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Provider Service";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return providerService.getGreeting(name);
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return providerService.addNumbers(a, b);
    }

    @GetMapping("/status")
    public String status() {
        return providerService.getStatus();
    }
}

