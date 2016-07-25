/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shilpa.productlist.obj;
import java.util.Scanner;

public class Product {
    Scanner input= new Scanner(System.in);
    String[] productName;
    double[] price;
    boolean[] status;
    int[] quantity;
    int pc=0;
    int a= 0;
    int j ;
    String result= "";
    boolean found= false;
    public Product(){
        
    }
    

    public Product(Scanner input,String[] productName, double[] price, boolean[] status, int[] quantity) {
        this.input= input;
        this.productName = productName;
        this.price = price;
        this.status = status;
        this.quantity = quantity;
    }
    
    public void productEntry(){
        if(pc<10){
        System.out.print("Enter new product's name: ");
        productName[pc]=input.next();
        a=pc;
       pc++;
        }else
            System.out.println("You have exceeded the limit of entry.");
    
}
    public void entryPrice(){
        System.out.print("Enter price for " + productName[a] + ":");
        price[a]=input.nextDouble();
        
    }
    public void entryQuantity(){
        System.out.println("Enter the quantity of " + productName[a] + ":");
        quantity[a]= input.nextInt();
        
    }
    public void entryStatus(){
        System.out.println("Enter the status of " + productName[a] + ":");
        status[a]= input.nextBoolean();
    }
    public void productSearch(){
        while(true){
        System.out.println("Enter the product's name:");
        result= input.next();
        
        for(int i=0; i<pc; i++){
            if(productName[i].equalsIgnoreCase(result)){
             
                if (status[i]== true) {
                    found= true;
                    j = i; 
                }
                } 
            
            }
        
        if(found==true)
        {
             System.out.println("Product details:");
            System.out.println("Product's name: "+productName[j]);
            System.out.println("Product's price: "+price[j]);
            System.out.println("Product's status: "+found);
            System.out.println("Product's quantity: "+quantity[j]);
        }else
            System.out.println("Product doesn't exist!");
        System.out.println("Do you want to continue (Y/N)?");
            String c= input.next();
            if(c.equalsIgnoreCase("n"))
                System.exit(0);
        }
        
        }
    }
