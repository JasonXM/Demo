package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jason
 * @Date: 2020/6/24 11:22
 * @Description:
 */
@RestController
@RequestMapping("/hellow")
public class HelloWord {

    @GetMapping("/t1")
    public String t1() {
        return "Hellow Word!";
    }
}
