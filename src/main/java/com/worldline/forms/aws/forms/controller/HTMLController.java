package com.worldline.forms.aws.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HTMLController {
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/data")
    public String data() {
        return "data";
    }
}
