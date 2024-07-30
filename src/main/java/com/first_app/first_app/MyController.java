package com.first_app.first_app;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MyController {

    @GetMapping("process-form")
    public static String getData(@RequestParam int num1, @RequestParam  int num2) {
        int ans = num1 + num2;
        return "Result = "+ans ;
    }

}
