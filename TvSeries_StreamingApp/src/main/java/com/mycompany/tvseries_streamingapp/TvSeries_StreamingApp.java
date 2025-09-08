/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tvseries_streamingapp;


import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class TvSeries_StreamingApp 
{

    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Series app = new Series(); //Stores the series
        
        //Menu
        while (true)
        {
          System.out.println("LATEST SERIES - 2025");
          System.out.println("**********************************");
          System.out.println("Enter (1) to launch the menu or any other key to exit");
          String input = scanner.nextLine();
          
          if (!input.equals("1"))break; // exit if input is not "1"
          
          //display menu
          System.out.println("Please select one of the following menu items:");
          System.out.println("(1) Capture a new series");
          System.out.println("(2) Search for a series");
          System.out.println("(3) Update series age restriction");
          System.out.println("(4) Delete a series");
          System.out.println("(5) Print series report - 2025");
          System.out.println("(6) Exit Application.");
          String choice = scanner.nextLine();
          
          switch (choice)//call method on menu choice
          {
              case "1" -> app.captureSeries();
              case "2" -> app.searchSeries();
              case "3" -> app.updateSeries();
              case "4" -> app.deleteSeries();
              case "5" -> app.seriesReport();
              case "6" -> app.exitSeriesApplication();
              default -> System.out.println("Invalid option. Please enter correct number.");
             
          }
          
        }
        
      
    }
    
    
}
