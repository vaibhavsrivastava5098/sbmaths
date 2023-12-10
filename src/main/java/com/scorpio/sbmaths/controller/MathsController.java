package com.scorpio.sbmaths.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @GetMapping("/add/{a}/{b}")
    public String add(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return "The sum is: "+(a+b);
    }

    @GetMapping("/subtract/{a}/{b}")
    public String subtract(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return "The subtraction is: "+(a-b);
    }
    @GetMapping("/mult/{a}/{b}")
    public String multiply(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return "The multiplication is: "+(a*b);
    }
    @GetMapping("/divide/{a}/{b}")
    public String divide(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return "The division is: "+(a/b);
    }

    @GetMapping("/remainder/{a}/{b}")
    public String remainder(@PathVariable("a") int a, @PathVariable("b") int b)
    {
        return "The remainder is: "+(a%b);
    }
}
