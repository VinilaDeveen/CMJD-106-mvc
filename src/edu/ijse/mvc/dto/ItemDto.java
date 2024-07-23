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
public class ItemDto {
    private String code;
    private String description;
    private String packSize;
    private double unitPrice;
    private int qoH;

    public ItemDto() {
    }

    public ItemDto(String code, String description, String packSize, double unitPrice, int qoH) {
        this.code = code;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qoH = qoH;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the packSize
     */
    public String getPackSize() {
        return packSize;
    }

    /**
     * @param packSize the packSize to set
     */
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    /**
     * @return the unitPrice
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the qoH
     */
    public int getQoH() {
        return qoH;
    }

    /**
     * @param qoH the qoH to set
     */
    public void setQoH(int qoH) {
        this.qoH = qoH;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "code=" + code + ", description=" + description + ", packSize=" + packSize + ", unitPrice=" + unitPrice + ", qoH=" + qoH + '}';
    }
    
    
    
}
