/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.billing.impl;

import com.kunwarprabin.billing.DAO.ProductsDAO;
import com.kunwarprabin.billing.entity.Products;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class ProductsDAOImpl implements ProductsDAO {

    ArrayList<Products> productslist = new ArrayList<>();
    @Override
    public boolean add(Products p) {
        return productslist.add(p);
    }

    @Override
    public ArrayList<Products> showAll() {
        return productslist;
    }
    
}
