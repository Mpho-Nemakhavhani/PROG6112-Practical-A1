/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tvseries_streamingapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Series 
{
    public Scanner myScanner = new Scanner(System.in);
    public ArrayList<SeriesModel> seriesList = new ArrayList<>(); // Arraylist to store all the captured series
    
    public void captureSeries() //Method to capture/ record new series
    {
        System.out.println("CAPTURE NEW SERIES");
        System.out.println("*****************************");
        System.out.print("Enter the series id: ");
        String id = myScanner.nextLine();
        
        System.out.print("Enter the series name: ");
        String name = myScanner.nextLine();
        
        int age = getValidAge(); // get valid age restriction (between 2 and 18)
        
        System.out.print("Enter the number of episodes for " + name + ":");
        int numEpisodes = Integer.parseInt(myScanner.nextLine());
        
        seriesList.add(new SeriesModel(id,name,age,numEpisodes));// save new series in memory
        
        System.out.println("Series processed successfully");
    }
    
    public int getValidAge()
    {
        while (true)
        {
            System.out.print("Enter the series age restriction: ");
            int age = Integer.parseInt(myScanner.nextLine());
            
            if (age >=2 && age <=18)//Check if age is per restricted
            {
                return age;
            }
            else
            {
                System.out.println("You have entered an incorrect series age!!!");
            }
            
                    
        }
    }
    
    public void searchSeries()//Method to search for a series by ID
    {
        System.out.print("Enter the series ID to search:");
        String id = myScanner.nextLine();
        
        SeriesModel found = findSeriesById(id); // look for series
        if(found != null)
        {
            System.out.println(found);
        }
        else
        {
            System.out.println("Series with series id: " + id + " was not found!");
        }
    }
    
    public void updateSeries() //Update an existing series
    {
        System.out.print("Enter the series id to update: ");
        String id = myScanner.nextLine();
        
        SeriesModel found = findSeriesById(id);
        if (found != null)
        {
            System.out.print("Enter the series name:");
            found.setSeriesName(myScanner.nextLine()); 
            
            found.setSeriesAge(getValidAge());// Update age restriction with validation
            
            System.out.print("Enter the number of episodes: "); 
            found.setSeriesNumberOfEpsodes(Integer.parseInt(myScanner.nextLine()));
            
            System.out.println("Series updated successfully1");
        }
        else
        {
            System.out.println("Series with series Id: " + id + " was not found!");
        }
    }
    
    public void deleteSeries()
    {
        System.out.print("Enter the series id to delete: ");
        String id = myScanner.nextLine();
        
        SeriesModel found = findSeriesById(id);
        if (found != null)
        {
            System.out.print("Are you sure you want to delete series " + id + " from the system? yes (y) to delete: ");
            String confirm = myScanner.nextLine();
            
            if (confirm.equalsIgnoreCase("y"))
            {
                seriesList.remove(found);
                System.out.println("Series with ID: " + id + " was deleted!");
                
            }
            else if(confirm.equalsIgnoreCase("N"))
            {
                System.out.println("Delete operation cancelled.");
            }
            else
            {
               System.out.println("Series with series Id:" + id + " was not found!");     
            }
        }
    }
    public void seriesReport()
    {
        if (seriesList.isEmpty())
        {
            System.out.println("No series available.");
        }
        else
        {
            int count = 1;
            for(SeriesModel s : seriesList) // loop through all the series and print out the details
            {
                System.out.println(" Series " + count ++);
                System.out.println("----------------------------------------");
                
                System.out.println(s);
                
                
            }
        }
    }
    
    public void exitSeriesApplication()
    {
        System.out.println("Exiting Application....GoodBye! ");
        System.exit(0);
    }
    
    public SeriesModel findSeriesById(String id)//Helper method to find series by Id
    {
        for(SeriesModel s : seriesList)
        {
            if(s.getSeriesId().equals(id))
            {
                return s;
            }
        }
        return null; //not found
    }
    
    public void captureSeriesTest(String id, String name, int age, int numEpisodes)
    {
        seriesList.add(new SeriesModel(id, name, age, numEpisodes));
    }
    
    public SeriesModel searchSeriesTest(String id)
    {
        return findSeriesById(id);
    }
    public boolean updateSeriesTest(String id, String name, int age, int numEpisodes)
    {
        SeriesModel s = findSeriesById(id);
        if(s != null)
        {
            s.setSeriesName(name);
            s.setSeriesAge(age);
            s.setSeriesNumberOfEpsodes(numEpisodes);
            return true;
        }
        return false;
    }
    public boolean deleteSeriesTest(String id)
    {
        SeriesModel s = findSeriesById(id);
        if(s != null)
        {
            seriesList.remove(s);
            return true;
        }
        return false;
    }
    public boolean isAgeValid(int age)
    {
        return age >=2 && age <=18;
    }
        
}