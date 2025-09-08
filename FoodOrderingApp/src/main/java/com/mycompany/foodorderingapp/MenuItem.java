/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodorderingapp;

/**
 *
 * @author RC_Student_lab
 */
public class MenuItem 
{
    private String itemName;
    private double itemPrice;
    
    //Constructor to initialize a menu item.
    public MenuItem(String name, double price)
    {
        this.itemName = name;
        this.itemPrice = price;
    }
    
    //Getter method to access private variables
    public String getItemName()
    {
        return itemName;
    }
    
    public double getItemPrice()
    {
        return itemPrice;
    }
    
    //method to display menu items
    @Override
    public String toString()
    {
        return itemName + " " + "R" + String.format("%.2f", itemPrice);//format the price value at 2 decimal places
    }
    
}
