/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.listener;

import com.spring3.tutorial.database.DatabaseConnectionManager;
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
        ServletContext sc = sce.getServletContext();
        String url = sc.getInitParameter("DBURL");
        String user = sc.getInitParameter("DBUSER");
        String password = sc.getInitParameter("DBPWD");
        DatabaseConnectionManager databaseConnectionManager = new DatabaseConnectionManager(url, user, password);
        sc.setAttribute("dbManager", databaseConnectionManager);
        System.out.println("Database connection initialized for Application.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        DatabaseConnectionManager databaseConnectionManager = (DatabaseConnectionManager) sc.getAttribute("dbManager");
        databaseConnectionManager.closeConnection();
        System.out.println("Database connection closed for Application.");
    }
    
}
