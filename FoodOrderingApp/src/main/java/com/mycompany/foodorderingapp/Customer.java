/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodorderingapp;

/**
 *
 * @author RC_Student_lab
 */
public class Customer 
{
    private String customerName;
    private String customerPhoneNumber;
    
    //constuctor
    public Customer(String name, String phone)
    {
        this.customerName = name;
        this.customerPhoneNumber = phone;
    }
    
    //Getter methods to access private variables
    public String getCustomerName()
    {
        return customerName;
    }
    
    public String getCustomerPhoneNumber()
    {
        return customerPhoneNumber;
    }
 
}
