/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.page;

import com.spring3.tutorial.model.Customer;

/**
 *
 * @author TRAN VAN PHU
 */
public class CustomerPage {
    
    private String stat;
    private int page;
    private int total;
    private Customer[] rows;

    public CustomerPage(String stat, int page, int total, Customer[] rows) {
        this.stat = stat;
        this.page = page;
        this.total = total;
        this.rows = rows;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Customer[] getRows() {
        return rows;
    }

    public void setRows(Customer[] rows) {
        this.rows = rows;
    }

}
