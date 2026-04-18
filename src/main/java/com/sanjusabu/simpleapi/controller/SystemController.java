package com.sanjusabu.simpleapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("status")
    public String status() {
        return "active";
    }

    @GetMapping("github-actions")
    public String actions() {
        return "CI pipeline implemented";
    }
}
