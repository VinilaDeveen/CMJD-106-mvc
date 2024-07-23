/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.model;

import java.sql.ResultSet;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustDto;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class CustModel {
    private final Connection connection;

    public CustModel() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }

    public String saveCust(CustDto custDto) throws Exception {
        String sql = "INSERT INTO customer VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custDto.getCustID());
        statement.setString(2, custDto.getCustTitle());
        statement.setString(3, custDto.getCustName());
        statement.setString(4, custDto.getDob());
        statement.setDouble(5, custDto.getSalary());
        statement.setString(6, custDto.getCustAddress());
        statement.setString(7, custDto.getCustCity());
        statement.setString(8, custDto.getCustProvince());
        statement.setString(9, custDto.getZip());
        
        return statement.executeUpdate()> 0 ? "Success" : "Fail";
    }

    public ArrayList<CustDto> getAllCust() throws SQLException {
        String sql = "SELECT * FROM customer";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<CustDto> custDtos = new ArrayList<>();
        while(rst.next()){
            CustDto dto = new CustDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"), rst.getString("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"), rst.getString("Province"), rst.getString("PostalCode"));
            custDtos.add(dto);
        }
        return custDtos;
    }

    public CustDto getCust(String custId) throws SQLException {
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        ResultSet rst = statement.executeQuery();
        
        while(rst.next()){
            CustDto dto = new CustDto(rst.getString("CustID"), rst.getString("CustTitle"), rst.getString("CustName"), rst.getString("DOB"), rst.getDouble("salary"), rst.getString("CustAddress"), rst.getString("City"), rst.getString("Province"), rst.getString("PostalCode"));
            return dto;
        }
        return null;
    }  

    public String getCustId(String custId) throws SQLException {
        String sql = "DELETE FROM customer WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, custId);
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail"; 
    }

    public String updateCust(CustDto dto) throws SQLException {
        String sql = "UPDATE customer SET CustTitle = ?, CustName = ?, DOB = ?, salary = ?, CustAddress = ?, City = ?, Province = ?, PostalCode = ? WHERE CustID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getCustTitle());
        statement.setString(2, dto.getCustName());
        statement.setString(3, dto.getDob());
        statement.setDouble(4, dto.getSalary());
        statement.setString(5, dto.getCustAddress());
        statement.setString(6, dto.getCustCity());
        statement.setString(7, dto.getCustProvince());
        statement.setString(8, dto.getZip());
        statement.setString(9, dto.getCustID());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
}
