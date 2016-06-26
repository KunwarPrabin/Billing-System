/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.billing;

import com.kunwarprabin.billing.controller.Controller;

/**
 *
 * @author OWNER
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.insertProducts();
        controller.billingMechanism();
    }
}
