package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class ConsumerServiceController {

    private final ConsumerService consumerService;

    // Constructor for construct object
    public ConsumerServiceController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return consumerService.fetchGreeting(name);
    }

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return consumerService.fetchAddition(a, b);
    }

    @GetMapping("/status")
    public String status() {
        return consumerService.fetchStatus();
    }
}

