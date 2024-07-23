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
public class OrderDto {
    private String orderId;
    private String custId;
    private String date;

    public OrderDto() {
    }

    public OrderDto(String orderId, String custId, String date) {
        this.orderId = orderId;
        this.custId = custId;
        this.date = date;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", custId=" + custId + ", date=" + date + '}';
    }
    
    
}
