/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author TRAN VAN PHU
 */
public class AppSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        // TO DO
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // TO DO
    }
    
}
