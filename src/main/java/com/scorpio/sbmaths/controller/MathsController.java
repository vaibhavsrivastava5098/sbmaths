package com.scorpio.sbmaths.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return a+b;
    }

    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return a-b;
    }
    @GetMapping("/mult/{a}/{b}")
    public int multiply(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return a*b;
    }
    @GetMapping("/divide/{a}/{b}")
    public int divide(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return a/b;
    }
}
