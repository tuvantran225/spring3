/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring3.tutorial.model;

import java.io.Serializable;
import java.sql.Blob;

/**
 *
 * @author TRAN VAN PHU
 */
public class Customer implements Serializable{
    
    private long id;
    private String company;
    private String lastName;
    private String firstName;
    private String emailAddress;
    private String jobTitle;
    private String businessPhone;
    private String homePhone;
    private String mobilePhone;
    private String faxNumber;
    private String address;
    private String city;
    private String stateProvince;
    private String zipPortalCode;
    private String countryRegion;
    private String webPage;
    private String notes;
    private Blob attachments;

    public Customer() {
    }

    public Customer(long id, String company, String lastName, String firstName, String emailAddress, String jobTitle, String businessPhone, String homePhone, String mobilePhone, String faxNumber, String address, String city, String stateProvince, String zipPortalCode, String countryRegion, String webPage, String notes, Blob attachments) {
        this.id = id;
        this.company = company;
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
        this.jobTitle = jobTitle;
        this.businessPhone = businessPhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.faxNumber = faxNumber;
        this.address = address;
        this.city = city;
        this.stateProvince = stateProvince;
        this.zipPortalCode = zipPortalCode;
        this.countryRegion = countryRegion;
        this.webPage = webPage;
        this.notes = notes;
        this.attachments = attachments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getBusinessPhone() {
        return businessPhone;
    }

    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getZipPortalCode() {
        return zipPortalCode;
    }

    public void setZipPortalCode(String zipPortalCode) {
        this.zipPortalCode = zipPortalCode;
    }

    public String getCountryRegion() {
        return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
        this.countryRegion = countryRegion;
    }

    public String getWebPage() {
        return webPage;
    }

    public void setWebPage(String webPage) {
        this.webPage = webPage;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Blob getAttachments() {
        return attachments;
    }

    public void setAttachments(Blob attachments) {
        this.attachments = attachments;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", company=" + company + ", lastName=" + lastName + ", firstName=" + firstName + ", emailAddress=" + emailAddress + ", jobTitle=" + jobTitle + ", businessPhone=" + businessPhone + ", homePhone=" + homePhone + ", mobilePhone=" + mobilePhone + ", faxNumber=" + faxNumber + ", address=" + address + ", city=" + city + ", stateProvince=" + stateProvince + ", zipPortalCode=" + zipPortalCode + ", countryRegion=" + countryRegion + ", webPage=" + webPage + ", notes=" + notes + ", attachments=" + attachments + '}';
    }

}
