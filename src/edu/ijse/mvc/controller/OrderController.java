/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import edu.ijse.mvc.model.OrderModel;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class OrderController {
    private OrderModel orderModel;

    public OrderController() throws Exception {
        orderModel = new OrderModel();
    }
    
    
    
    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
        return orderModel.placeOrder(orderDto, orderDetailDtos);
    }
}
