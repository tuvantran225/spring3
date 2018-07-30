/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.controller;

import com.spring3.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author frank.tran
 */

@Controller
public class EmployeeController {
    
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }
    
    @RequestMapping("/empform")
    public ModelAndView showForm() {
        return new ModelAndView("empform");
    }
    
}
