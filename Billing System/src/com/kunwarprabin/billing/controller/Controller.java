/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kunwarprabin.billing.controller;

import com.kunwarprabin.billing.DAO.ProductsDAO;
import com.kunwarprabin.billing.entity.Products;
import com.kunwarprabin.billing.impl.ProductsDAOImpl;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class Controller {

    Scanner input = new Scanner(System.in);
    ProductsDAO productsDAO = new ProductsDAOImpl();

    public void insertProducts() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\GITHUB\\Billing-System\\src\\data.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] splitter = line.split(",");
                Products products = new Products();
                products.setProd_id(Integer.parseInt(splitter[0]));
                products.setProd_name(splitter[1]);
                products.setPrice(Integer.parseInt(splitter[2]));
                products.setQuantity(Integer.parseInt(splitter[3]));
                productsDAO.add(products);

            }

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    public void billingMechanism() {
        while(true){
            System.out.println("---------------------------------------------------");
        System.out.println("Enter Products id");
        int choice = input.nextInt();
        for (Products p : productsDAO.showAll()) {
            if (p.getProd_id() == choice) {
                System.out.println("Product Name =" + p.getProd_name());
                System.out.println("Product Price=" + p.getPrice());
                System.out.println("Total Product Quantity=" + p.getQuantity());
                System.out.println("------------------------------------------------------");

                System.out.println("Enter The quantity of products you want to buy?");
                int quantity = input.nextInt();
                if (quantity <= p.getQuantity()) {
                    int totalPrice = quantity * p.getPrice();
                    System.out.println("Total Price of the product=" + totalPrice);
                    System.out.println("---------------------------------------------------");

                    System.out.println("Do you want to buy this Product[Y/N]");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.out.println("Enter Your Amount:");
                        int userAmount = input.nextInt();
                        if (userAmount >= totalPrice) {
                            int returnChange = (userAmount - totalPrice);
                            System.out.println("Change=" + returnChange);
                            int remainingQuantity = p.getQuantity() - quantity;
                            System.out.println("Remaining Quantity=" + remainingQuantity);
                            System.out.println("--------------------------------------------");
                            if (remainingQuantity == 0) {
                                System.out.println("**Sorry No more products Available**");
                            }
                        } else {
                            System.out.println("**Please make full payment**");
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    System.out.println("**Quantity not available**");
                }
            }
        }
        System.out.println("Do You want to buy again [Y/N]?");
        if (input.next().equalsIgnoreCase("n")) {
            System.exit(0);
        }
        }
    }
}
