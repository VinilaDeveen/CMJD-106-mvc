/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class OrderModel {
    private Connection connection;

    public OrderModel() throws ClassNotFoundException, SQLException {
        connection = DBConnection.getInstance().getConnection();
    }
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
        try {
          connection.setAutoCommit(false);
          
          String orderSql = "INSERT INTO orders VALUES(?,?,?)";
          PreparedStatement orderStatement = connection.prepareStatement(orderSql);
          orderStatement.setString(1, orderDto.getOrderId());
          orderStatement.setString(2, orderDto.getDate());
          orderStatement.setString(3, orderDto.getCustId());
          
          boolean isOrderSaved = orderStatement.executeUpdate() > 0;
          
          if (isOrderSaved){
              boolean isOrderDetailSaved = true;
              
              String orderDetailSql = "INSERT INTO orderdetail VALUES(?,?,?,?)";
              
              for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                  PreparedStatement orderDetailStatement = connection.prepareStatement(orderDetailSql);
                  orderDetailStatement.setString(1, orderDto.getOrderId());
                  orderDetailStatement.setString(2, orderDetailDto.getItemCode());
                  orderDetailStatement.setInt(3, orderDetailDto.getQty());
                  orderDetailStatement.setDouble(4, orderDetailDto.getDiscount());
                  
                  if(!(orderDetailStatement.executeUpdate() > 0)){
                      isOrderDetailSaved = false;
                  }
              }
              
              if (isOrderDetailSaved) {
                  boolean isItemUpdated = true;
                  
                  String itemUpdateSql = "UPDATE item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                  
                  for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                      PreparedStatement itemUpdateStatement = connection.prepareStatement(itemUpdateSql);
                      itemUpdateStatement.setInt(1, orderDetailDto.getQty());
                      itemUpdateStatement.setString(2, orderDetailDto.getItemCode());
                      
                      if (!(itemUpdateStatement.executeUpdate() > 0)){
                          isItemUpdated = false;
                      }
                  }
                  
                  if (isItemUpdated){
                      connection.commit();
                      return "Success";
                  }else{
                      connection.rollback();
                      return "Error at item update";
                  }
                  
              }else{
                  connection.rollback();
                  return "Error at order detail save";
              }
              
          }else{
              connection.rollback();
              return "Error at order save";
          }
        } catch (Exception e) {
          connection.rollback();
          e.printStackTrace();
          return e.getMessage();
        }finally{
          connection.setAutoCommit(true);          
        }
    }
    
}
