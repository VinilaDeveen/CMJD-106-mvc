/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ItemController {
    private ItemModel itemModel;

    public ItemController() throws Exception {
        this.itemModel = new ItemModel();
    }
    
    public String saveItem(ItemDto itemDto) throws Exception{
        String resp = itemModel.saveItem(itemDto);
        return resp;
    }
    
    public ArrayList<ItemDto> getAllItem() throws Exception{
        ArrayList<ItemDto> itemDtos = itemModel.getAllItem();
        return itemDtos;
    }

    public ItemDto searchItem(String itemId) throws Exception {
        ItemDto itemDto = itemModel.getItem(itemId);
        return itemDto;
    }

    public String deleteItem(String itemId) throws SQLException {
        String resp = itemModel.deleteItem(itemId);
        return resp;
    }

    public String upadateItem(ItemDto dto) throws SQLException {
        String resp = itemModel.updateItem(dto);
        return resp;
    }
    
}
