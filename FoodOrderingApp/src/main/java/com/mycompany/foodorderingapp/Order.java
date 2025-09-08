/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodorderingapp;

import java.util.ArrayList;


/**
 *
 * @author RC_Student_lab
 */
public class Order 
{
    private Customer customer; //Customer placing an order
    private ArrayList<MenuItem>items; //List to store ordered items
    
    //Constructor to initialize customer and item list
    public Order(Customer customer)
    {
        this.customer = customer;
        this.items = new ArrayList<>();
    }
    
    //Method to add new items to the order
    public void addItems(MenuItem item)
    {
        items.add(item);
    }
    
    //Calculate the total price of the order
    public double calculateTotal()
    {
        double total = 0;
        //Loop through the array list to summ up all the prices
        for (MenuItem item : items)
        {
            total += item.getItemPrice();
        }
        return total;
    }
    
    //Get the list of items
    public ArrayList<MenuItem>getItems()
    {
        return items;
    }
    
    //Get customer information
    public Customer getCustomer()
    {
       return customer; 
    }

} 
     

