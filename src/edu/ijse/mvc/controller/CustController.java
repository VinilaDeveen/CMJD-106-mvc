/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.CustDto;
import edu.ijse.mvc.model.CustModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CustController {
    private CustModel custModel;

    public CustController() throws Exception{
        this.custModel = new CustModel();
    }
    
    public String saveCust(CustDto custDto) throws Exception{
        String resp = custModel.saveCust(custDto);
        return resp;
    }  

    public ArrayList<CustDto> getAllCust() throws SQLException {
        ArrayList<CustDto> custDtos = custModel.getAllCust();
        return custDtos;
    }

    public CustDto searchCust(String custId) throws SQLException {
        CustDto custDto = custModel.getCust(custId);
        return custDto;
    }

    public String deleteCust(String custId) throws SQLException {
        String resp = custModel.getCustId(custId);
        return resp;
    }
        
    public String updateCust(CustDto dto) throws SQLException {
        String resp = custModel.updateCust(dto);
        return resp;
    }
}
