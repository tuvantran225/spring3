/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.controller;

import com.spring3.tutorial.model.TestModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author TRAN VAN PHU
 */
@Controller
public class TestController {
    
    @RequestMapping("/test")
    @ResponseBody
    public TestModel getModel(@RequestBody TestModel model) {
        return model;
    }
    
}
