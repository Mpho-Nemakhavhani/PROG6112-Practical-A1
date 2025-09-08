/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
 */

package com.mycompany.tvseries_streamingapp;

/**
 *
 * @author RC_Student_lab
 */
public class SeriesModel 
{
    //declare ariables for the series details
    public String seriesId;
    public String seriesName;
    public int seriesAge;
    public int seriesNumberOfEpisodes;
    
    //Constructor to create a new series object
    public SeriesModel(String id, String name, int age, int numEpisodes)
    {
       this.seriesId = id;
       this.seriesName = name;
       this.seriesAge = age;
       this.seriesNumberOfEpisodes = numEpisodes;
    }


    
    //Getter and Setter methods to access and update the fields
    public String getSeriesId()
    {
        return seriesId;
    }
    
    public void setSeriesId(String seriesId)
    {
       this.seriesId = seriesId; 
    }
    
    public String getSeriesName()
    {
        return seriesName;
    }
    
    public void setSeriesName(String seriesName)
    {
       this.seriesName = seriesName; 
    }
    
    public int getSeriesAge()
    {
        return seriesAge;
    }
    
    public void setSeriesAge(int seriesAge)
    {
       this.seriesAge = seriesAge; 
    }
    
    public int getSeriesNumberOfEpisodes()
    {
        return seriesNumberOfEpisodes;
    }
    
    public void setSeriesNumberOfEpsodes( int seriesNumberOfEpisodes)
    {
        this.seriesNumberOfEpisodes = seriesNumberOfEpisodes;
    }
    
    //Method to display details of the series
    @Override
   public String toString()
   {
       return "SERIES ID:" + seriesId + 
               "\nSERIES NAME: " + seriesName + 
               "\nSERIES AGE RESTRICTION:" + seriesAge + 
               "\nNUMBER OF EPISODES: " + seriesNumberOfEpisodes;
   }

    short getSeriesNumberOfEpsodes() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
}
