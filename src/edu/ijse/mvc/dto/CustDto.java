/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author HP
 */
public class CustDto {
    private String custID;
    private String custTitle;
    private String custName;
    private String dob;
    private double salary;
    private String custAddress;
    private String custCity;
    private String custProvince;
    private String zip;

    public CustDto() {
    }

    public CustDto(String custID, String custTitle, String custName, String dob, double salary, String custAddress, String custCity, String custProvince, String zip) {
        this.custID = custID;
        this.custTitle = custTitle;
        this.custName = custName;
        this.dob = dob;
        this.salary = salary;
        this.custAddress = custAddress;
        this.custCity = custCity;
        this.custProvince = custProvince;
        this.zip = zip;
    }

    

    /**
     * @return the custID
     */
    

    @Override
    public String toString() {
        return "CustDto{" + "custID=" + getCustID() + ", custTitle=" + getCustTitle() + ", custName=" + getCustName() + ", dob=" + getDob() + ", salary=" + getSalary() + ", custAddress=" + getCustAddress() + ", custCity=" + getCustCity() + ", custProvince=" + getCustProvince() + ", zip=" + getZip() + '}';
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }

    /**
     * @return the custTitle
     */
    public String getCustTitle() {
        return custTitle;
    }

    /**
     * @param custTitle the custTitle to set
     */
    public void setCustTitle(String custTitle) {
        this.custTitle = custTitle;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the custCity
     */
    public String getCustCity() {
        return custCity;
    }

    /**
     * @param custCity the custCity to set
     */
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    /**
     * @return the custProvince
     */
    public String getCustProvince() {
        return custProvince;
    }

    /**
     * @param custProvince the custProvince to set
     */
    public void setCustProvince(String custProvince) {
        this.custProvince = custProvince;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
}
