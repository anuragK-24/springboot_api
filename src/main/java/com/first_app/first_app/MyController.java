package com.first_app.first_app;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

    @RequestMapping("anurag")
    public static String home() {
        return "Hello anurag!";
    }

}
