package com.example.demoModuleForGet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTest {
    @GetMapping("/hello")
    public String returnRest(){
        return "hello";
    }
}
