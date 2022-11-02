package com.kodilla.pro.core.task.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class MController {

    @GetMapping("/one")
    public String m1() {
        return "m1 was called - Have a nice day!";
    }

    @GetMapping("/two")
    public String m2() {
        return "m2 was called - How can I help you?";
    }

    @GetMapping("/three")
    public String m3() {
        return "m3 was called - Let go...";
    }

}
