/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.billing.entity;

/**
 *
 * @author OWNER
 */
public class Products {
    private int prod_id,quantity,price;
    private String prod_name;

    public Products() {
    }

    public Products(int prod_id, int quantity, int price, String prod_name) {
        this.prod_id = prod_id;
        this.quantity = quantity;
        this.price = price;
        this.prod_name = prod_name;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }
    
    
}
