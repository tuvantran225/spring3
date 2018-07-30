/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author TRAN VAN PHU
 */

@Controller
public class HelloWorldController {
    
    @RequestMapping("/")
    public ModelAndView welcome() {
        return new ModelAndView("index");
    }
    
    @RequestMapping("/hello")
    public ModelAndView hello() {
        return new ModelAndView("hello", "message", "Welcome to Spring 3");
    }
    
    @RequestMapping("/hi")
    public ModelAndView hi() {
        return new ModelAndView("hi", "message", new Person(28, "Frank"));
    }
    
    @RequestMapping("/login")
    public ModelAndView login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username == null) {
            return new ModelAndView("login");
        }
        if ("admin".equals(password)) {
            return new ModelAndView("login-success", "message", "Hello " + username);
        }
        return new ModelAndView("login-failed", "message", "Username or Password error");
    }
    
}