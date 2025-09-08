/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodorderingapp;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author RC_Student_lab
 */
public class OrderTest 
{
    private Order order;
    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("John Doe", "0812345678");
        order = new Order(customer);
    }

    @Test
    public void testAddItems() {
        MenuItem item1 = new MenuItem("Chicken Burger", 49.99);
        MenuItem item2 = new MenuItem("Fanta Orange", 9.99);

        order.addItems(item1);
        order.addItems(item2);

        ArrayList<MenuItem> items = order.getItems();

        assertEquals(2, items.size());
        assertEquals("Chicken Burger", items.get(0).getItemName());
        assertEquals(49.99, items.get(0).getItemPrice(), 0.01);
        assertEquals("Fanta Orange", items.get(1).getItemName());
        assertEquals(9.99, items.get(1).getItemPrice(), 0.01);
    }

    @Test
    public void testCalculateTotal() {
        order.addItems(new MenuItem("Chicken Burger", 49.99));
        order.addItems(new MenuItem("Coca-Cola", 9.99));

        double total = order.calculateTotal();
        assertEquals(59.98, total, 0.01);
    }

    @Test
    public void testGetCustomer() {
        Customer testCustomer = order.getCustomer();
        assertEquals("John Doe", testCustomer.getCustomerName());
        assertEquals("0812345678", testCustomer.getCustomerPhoneNumber());
    }

    @Test
    public void testEmptyOrderTotal() {
        double total = order.calculateTotal();
        assertEquals(0.0, total, 0.01);
    }
    
}
