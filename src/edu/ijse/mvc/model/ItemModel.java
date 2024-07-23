/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ItemModel {
    private final Connection connection;

    public ItemModel() throws ClassNotFoundException, SQLException {
        this.connection = DBConnection.getInstance().getConnection();
    }
    
    public String saveItem(ItemDto itemDto) throws Exception {
        String sql = "INSERT INTO item VALUES(?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemDto.getCode());
        statement.setString(2, itemDto.getDescription());
        statement.setString(3, itemDto.getPackSize());
        statement.setDouble(4, itemDto.getUnitPrice());
        statement.setInt(5, itemDto.getQoH());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        String sql = "SELECT * FROM item";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet rst = statement.executeQuery();
        
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
        while (rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"), rst.getInt("UnitPrice"), rst.getInt("QtyOnHand"));
            itemDtos.add(dto);
        }
        return itemDtos;
    }

    public ItemDto getItem(String itemCode) throws Exception{
        String sql = "SELECT * FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemCode);
        ResultSet rst = statement.executeQuery();
        while(rst.next()){
            ItemDto dto = new ItemDto(rst.getString("ItemCode"), rst.getString("Description"), rst.getString("PackSize"), rst.getInt("UnitPrice"), rst.getInt("QtyOnHand"));
            return dto;
        }
        return null;
    }

    public String deleteItem(String itemCode) throws SQLException {
        String sql = "DELETE FROM item WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, itemCode);
        
        return statement.executeUpdate() > 0 ? "Success":"Fail";
    }

    public String updateItem(ItemDto dto) throws SQLException {
        String sql = "UPDATE item SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, dto.getDescription());
        statement.setString(2, dto.getPackSize());
        statement.setDouble(3, dto.getUnitPrice());
        statement.setInt(4, dto.getQoH());
        statement.setString(5, dto.getCode());
        
        return statement.executeUpdate() > 0 ? "Success" : "Fail";
    }
}
