package com.proanalitika.learnws.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/services")
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name;
    }

    @GetMapping("/echo")
    public String echo(@RequestParam String text) {
        return text;
    }

    @PostMapping("/sum")
    public Map<String, Integer> sum(@RequestBody Map<String, Integer> body) {
        int a = body.getOrDefault("a", 0);
        int b = body.getOrDefault("b", 0);
        return Map.of("result", a + b);
    }
}
