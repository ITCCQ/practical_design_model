package com.cai.practical.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/5/31.
 */
@RestController
@RequestMapping("/api")
public class TestHelloController {


    @RequestMapping("/hello")
    public String showHello() {
        return "你看到这个会很开心";

    }
}
