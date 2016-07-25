/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.productlist;

import com.Shilpa.productlist.obj.Product;
import java.util.Scanner;

public class ProductList {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        String[] productName=new String[10];
        double[] price= new double[productName.length];
        boolean[] status=new boolean[productName.length];
        int[] quantity= new int[productName.length];
        Product product=new Product(input, productName, price, status, quantity);
        while(true){
            System.out.println("1. Enter the product name:");
            System.out.println("2. Enter the status of product: ");
            System.out.println("3. Enter the price of poduct:");
            System.out.println("4. Enter the quantity of product:");
            System.out.println("5. Search a product:");
            System.out.println("6. Exit");
            int choice= input.nextInt();
            switch(choice){
                case 1:
                    product.productEntry();
                    break;
                case 2:
                product.entryStatus();
                break;
            
            case 3:
                product.entryPrice();
                break;
            case 4:
                product.entryQuantity();
                break;
            case 5:
                product.productSearch();
                break;
            case 6:
                System.exit(0);
                break;
            }
            System.out.println("Do you want to continue (Y/N)?");
            String c= input.next();
            if(c.equalsIgnoreCase("n"))
                System.exit(0);
            
        }
        
    }
    
}
