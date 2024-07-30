package com.first_app.first_app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HtmlController {
    @RequestMapping("abc")
    public String getMethodName() {
        return "abc";
    }
    
}
