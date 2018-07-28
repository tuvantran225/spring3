/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author TRAN VAN PHU
 */

@Controller
public class HelloWorldController {
    
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {
        return new ModelAndView("hellopage", "message", "Welcome to Spring 3");
    }
    
}
