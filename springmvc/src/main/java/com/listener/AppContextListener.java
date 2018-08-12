/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author TRAN VAN PHU
 */
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext ctx = sce.getServletContext();
        String url = ctx.getInitParameter("DBURL");
    	String u = ctx.getInitParameter("DBUSER");
    	String p = ctx.getInitParameter("DBPWD");
        System.out.println("Following database connection initialized for Application:");
        System.out.println("\t" + url);
        System.out.println("\t" + u);
        System.out.println("\t" + p);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Database connection closed for Application.");
    }
    
}
