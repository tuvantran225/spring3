/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 *
 * @author TRAN VAN PHU
 */
public class AppContextAttributeListener implements ServletContextAttributeListener {

    @Override
    public void attributeAdded(ServletContextAttributeEvent scab) {
        System.out.println("ServletContext attribute added:");
        System.out.println("\t" + scab.getName());
        System.out.println("\t" + scab.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scab) {
        System.out.println("ServletContext attribute replaced:");
        System.out.println("\t" + scab.getName());
        System.out.println("\t" + scab.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scab) {
        System.out.println("ServletContext attribute removed:");
        System.out.println("\t" + scab.getName());
        System.out.println("\t" + scab.getValue());
    }
    
}
