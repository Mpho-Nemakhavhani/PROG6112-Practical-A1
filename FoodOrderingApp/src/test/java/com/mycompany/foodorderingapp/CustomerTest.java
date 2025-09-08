/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodorderingapp;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author RC_Student_lab
 */
public class CustomerTest 
{
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("John Doe", "0812345678");
    }

    @Test
    public void testGetCustomerName() {
        assertEquals("John Doe", customer.getCustomerName());
    }

    @Test
    public void testGetCustomerPhoneNumber() {
        assertEquals("0812345678", customer.getCustomerPhoneNumber());
    }
    
}
