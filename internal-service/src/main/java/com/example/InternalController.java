package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InternalController {

    @GetMapping("/test")
    public String hello() {
        return "Hello from internal controller";
    }
}
