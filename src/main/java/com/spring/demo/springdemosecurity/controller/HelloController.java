package com.spring.demo.springdemosecurity.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenzt
 * @date 2022/6/1
 */
@Controller
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info("登录用户的信息: " + userDetails.toString());
        return "hello";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAuthority('/user')")
    public String user() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        log.info("登录用户的信息: " + userDetails.toString());
        return "user";
    }
}
