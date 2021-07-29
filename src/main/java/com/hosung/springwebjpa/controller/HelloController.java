package com.hosung.springwebjpa.controller;

import com.hosung.springwebjpa.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello helloworld() {
        Hello hello = new Hello("안녕하세요.");
        return hello;
    }
}
