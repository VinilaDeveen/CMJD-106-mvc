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
public class OrderDetailDto {
    private String orderId;
    private String itemCode;
    private int qty;
    private double discount;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderId, String itemCodeString, int qty, double discount) {
        this.orderId = orderId;
        this.itemCode = itemCodeString;
        this.qty = qty;
        this.discount = discount;
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
     * @return the itemCodeString
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCodeString the itemCodeString to set
     */
    public void setItemCode(String itemCodeString) {
        this.itemCode = itemCodeString;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "orderId=" + orderId + ", itemCode=" + itemCode + ", qty=" + qty + ", discount=" + discount + '}';
    }
 
}
