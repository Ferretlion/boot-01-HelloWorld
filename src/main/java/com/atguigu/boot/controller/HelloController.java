package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ferretlion
 * @version jdk1.11
 * @description:
 * @E-mail 1023744469@qq.com
 * @create 2021-11-20-15:15
 */

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    public String handle01()
    {
        return "Hello, Spring Boot 2!";
    }
}
