/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.billing.DAO;

import com.kunwarprabin.billing.entity.Products;
import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public interface ProductsDAO {
    boolean add(Products p);
    ArrayList<Products> showAll();
}
