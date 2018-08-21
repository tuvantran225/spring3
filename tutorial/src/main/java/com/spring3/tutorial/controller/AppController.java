/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.controller;

import com.spring3.tutorial.database.DatabaseConnectionManager;
import com.spring3.tutorial.model.Customer;
import com.spring3.tutorial.page.CustomerPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author TRAN VAN PHU
 */
@Controller
public class AppController {
    
    @Autowired
    private ServletContext context;
    
    private List<Customer> getAllCustomers() {
        List<Customer> customers = new ArrayList<>();
        try {
            DatabaseConnectionManager connectionManager = (DatabaseConnectionManager) context.getAttribute("dbManager");
            Statement stmt = connectionManager.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers");
            while (rs.next()) {
                long id = rs.getLong("id");
                String company = rs.getString("company");
                String lastName = rs.getString("last_name");
                String firstName = rs.getString("first_name");
                String emailAddress = rs.getString("email_address");
                String jobTitle = rs.getString("job_title");
                String businessPhone = rs.getString("business_phone");
                String homePhone = rs.getString("home_phone");
                String mobilePhone = rs.getString("mobile_phone");
                String faxNumber = rs.getString("fax_number");
                String address = rs.getString("address");
                String city = rs.getString("city");
                String stateProvince = rs.getString("state_province");
                String zipPortalCode = rs.getString("zip_postal_code");
                String countryRegion = rs.getString("country_region");
                String webPage = rs.getString("web_page");
                String notes = rs.getString("notes");
//                Blob attachments = rs.getBlob("attachments");
                Customer customer = new Customer(id, company, lastName, firstName, emailAddress, jobTitle, businessPhone, homePhone, mobilePhone, faxNumber, address, city, stateProvince, zipPortalCode, countryRegion, webPage, notes, null);
                customers.add(customer);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AppController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }
    
    @RequestMapping(value = "/getCustomers")
    @ResponseBody
    public CustomerPage getCustomerPage(
            @RequestParam String company,
            @RequestParam String lastName,
            @RequestParam String firstName,
            @RequestParam String email,
            @RequestParam String jobTitle,
            @RequestParam String businessPhone,
            @RequestParam String homePhone,
            @RequestParam String mobilePhone,
            @RequestParam String faxNumber,
            @RequestParam String address,
            @RequestParam String city,
            @RequestParam String state,
            @RequestParam String zip,
            @RequestParam String country,
            @RequestParam String webPage,
            @RequestParam String notes) {
        List<Customer> customers = getAllCustomers();
        Customer[] customerArray = new Customer[customers.size()];
        customerArray = customers.toArray(customerArray);
        CustomerPage customerPage = new CustomerPage("ok", 1, customers.size(), customerArray);
        return customerPage;
    }
    
    @RequestMapping("/customers")
    public String customerHome() {
        return "customer";
    }
}
