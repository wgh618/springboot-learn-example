package com.will.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:HelloWorldController
 * Description:
 *
 * @Author Will Wu
 * @Email willwu618@gmail.com
 * @Date 2018-01-02
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
