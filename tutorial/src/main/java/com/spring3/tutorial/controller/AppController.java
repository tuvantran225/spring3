/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.controller;

import com.spring3.tutorial.database.DatabaseConnectionManager;
import com.spring3.tutorial.model.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author TRAN VAN PHU
 */

@Controller
public class AppController {
    
    private final Connection connection = new DatabaseConnectionManager().getConnection();
    
    @RequestMapping("/customers")
    public ModelAndView getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("");
            while (rs.next()) {
                String id = rs.getString("CustomerID");
                String companyName = rs.getString("CompanyName");
                String contactName = rs.getString("ContactName");
                String contactTitle = rs.getString("ContactTitle");
                String address = rs.getString("Address");
                String city = rs.getString("City");
                String region = rs.getString("Region");
                String postalCode = rs.getString("PostalCode");
                String country = rs.getString("Country");
                String phone = rs.getString("Phone");
                String fax = rs.getString("Fax");
                Customer customer = new Customer(id, companyName, contactName, contactTitle, address, city, region, postalCode, country, phone, fax);
                customers.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new ModelAndView("customer", "customer", customers);
    }
    
}
