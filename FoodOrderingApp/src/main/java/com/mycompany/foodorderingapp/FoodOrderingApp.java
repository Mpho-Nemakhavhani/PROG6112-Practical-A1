/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foodorderingapp;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class FoodOrderingApp 
{
    public static void main(String[] args) 
    {
        Scanner myScanner = new Scanner(System.in);
        
        //Parallel Array of the menu
        String[] itemName = 
        {"Chicken Burger","Beef Burger","4 lemon cheddar Wings",
         "4 spicy honey Wings","Chillie cheese Fries","200g Smoked Ribs","500g Smoked Ribs",
         "Mango Crusher","Foodie Crusher","Fanta Orange","Coca-Cola","Ice Cream","Chocolate cake","Red Velvet Cake"
        };
        
        double[] itemPrice = 
        {49.99, 59.99, 55.98, 55.98, 67.50, 87.99, 99.98, 38.00, 29.99, 9.99, 9.99, 8.98, 25.50, 35.50};
        
        //Array for customer's order limit
        String[] orderName = new String[6];
        double[] orderPrice = new double[6];
        int orderCount = 0;
        
        
        
        
        //Get customer infomation
        System.out.print("Enter your name: ");
        String customerName = myScanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = myScanner.nextLine();
        
        int choice;
        do 
        {
            System.out.println("\nMenu:");
            for (int i = 0; i < itemName.length; i++) 
            {
                System.out.println((i + 1) + ". " + itemName[i] + " - R" + String.format("%.2f", itemPrice[i]));
            }
            System.out.println("Enter 0 to exit the menu and stop ordering");
            System.out.print("Enter item number: ");
            choice = myScanner.nextInt();

            if (choice > 0 && choice <= itemName.length) 
            {
                if (orderCount < orderName.length) 
                {
                    orderName[orderCount] = itemName[choice - 1];
                    orderPrice[orderCount] = itemPrice[choice - 1];
                    orderCount++;
                    System.out.println(itemName[choice - 1] + " added!");
                } 
                else 
                {
                    System.out.println("\nYou've reached the maximum number of items allowed (" + orderName.length + ").");
                    System.out.println("Options:");
                    System.out.println("1. Replace an existing item");
                    System.out.println("2. Cancel adding new item");
                    System.out.println("3. View current order");
                    System.out.print("Enter your choice: ");
                    int overLimitChoice = myScanner.nextInt();
                    myScanner.nextLine(); // consume newline

                    switch (overLimitChoice) 
                    {
                        case 1 -> 
                        {
                            System.out.println("Current Order:");
                            for (int i = 0; i < orderCount; i++) 
                            {
                                System.out.println((i + 1) + ". " + orderName[i] + " - R" + String.format("%.2f", orderPrice[i]));
                            }
                            
                            System.out.print("Enter the number of the item you want to replace: ");
                            int replaceIndex = myScanner.nextInt() - 1;

                            if (replaceIndex >= 0 && replaceIndex < orderCount) 
                            {
                                orderName[replaceIndex] = itemName[choice - 1];
                                orderPrice[replaceIndex] = itemPrice[choice - 1];
                                System.out.println("Item replaced with " + itemName[choice - 1] + "!");
                            } 
                            else 
                            {
                                System.out.println("Invalid item number to replace.");
                            }
                        }

                        case 2 -> System.out.println("Item not added.");
                        case 3 -> 
                        {
                            System.out.println("Your Current Order:");
                            for (int i = 0; i < orderCount; i++) 
                            {
                                System.out.println((i + 1) + ". " + orderName[i] + " - R" + String.format("%.2f", orderPrice[i]));
                            }
                        }
                        default -> System.out.println("Invalid choice.");
                    }
                }
            } 
            else if (choice != 0) 
            {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        
        //print receipt
        System.out.println("\nOrder summary for " + customerName + ":");
        System.out.println("***************************************");
        double total = 0;
        for(int i = 0; i < orderCount; i++)
        {
            System.out.println(orderName[i] + "- R" + String.format("%.2f",orderPrice[i]));
            total += orderPrice[i];
        }
        System.out.println("********************************");
        System.out.println("TOTAL: R" + String.format("%.2f",total));
        System.out.println("Thank you for ordering with Mr Foodie!" + "ENJOY!");
        myScanner.close();
    }

    
}
