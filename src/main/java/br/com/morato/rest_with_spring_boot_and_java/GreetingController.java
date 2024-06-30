package br.com.morato.rest_with_spring_boot_and_java;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/greeting")
    public Greeting greetin(
        @RequestParam(value = "name", defaultValue = "World") 
        String name) {
            return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
