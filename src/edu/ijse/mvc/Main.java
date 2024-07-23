/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.mvc;

import edu.ijse.mvc.view.CustView;
import edu.ijse.mvc.view.ItemView;
import edu.ijse.mvc.view.OrderView;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        new ItemView().setVisible(true);
        new CustView().setVisible(true);
        new OrderView().setVisible(true);
    }
    
}
