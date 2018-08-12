/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 *
 * @author TRAN VAN PHU
 */
public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
    	System.out.println("ServletRequest destroyed:");
        System.out.println("\tRemote IP: "+ servletRequest.getRemoteAddr());
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("ServletRequest initialized:");
        System.out.println("\tRemote IP: "+ servletRequest.getRemoteAddr());
    }
    
}
