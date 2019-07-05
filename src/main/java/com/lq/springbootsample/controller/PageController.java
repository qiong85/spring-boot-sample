package com.lq.springbootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qliu84
 * @version 1.0
 * @date 2019/7/5 13:56
 */
@Controller
public class PageController {
    @RequestMapping("index.html")
    public String index() {
        return "index";
    }
}

