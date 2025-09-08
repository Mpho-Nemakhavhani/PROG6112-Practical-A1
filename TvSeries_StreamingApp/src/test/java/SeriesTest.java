
import com.mycompany.tvseries_streamingapp.Series;
import com.mycompany.tvseries_streamingapp.SeriesModel;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class SeriesTest 
{
   private Series seriesApp; 
   
   @BeforeEach
   public void setUp()
   {
       seriesApp = new Series();
       //preload some series for testing
       seriesApp.captureSeriesTest("101", "Etreme sports", 12,10);
       seriesApp.captureSeriesTest("102", "Hunters", 10,10);
   }
   
   @Test
   public void testSearchSeries_Found()
   {
       Series series = new Series();
       series.captureSeriesTest("101", "Sports", 16, 25);
       SeriesModel found = series.searchSeriesTest("101");
       assertNotNull(found);
       assertEquals("Sports", found.getSeriesName());
   }
   
   @Test
   public void testSearchSeries_NotFound()
   {
       assertNull(seriesApp.searchSeriesTest("999"));
   }
   @Test
   public void testUpdateSeries()
   {
       boolean updated = seriesApp.updateSeriesTest("101", "Extreme sports 2025",10,12 );
       assertTrue(updated);
       SeriesModel s = seriesApp.searchSeriesTest("101");
       assertEquals("Extreme sports 2025", s.getSeriesName());
       assertEquals(10, s.getSeriesAge());
       assertEquals(12, s.getSeriesNumberOfEpisodes());
   }
   @Test
   public void testDeleteSeries()
   {
       boolean deleted = seriesApp.deleteSeriesTest("102");
       assertTrue(deleted);
       assertNull(seriesApp.searchSeriesTest("102"));
   }
   @Test
   public void testDeleteSeries_NotFound()
   {
     boolean deleted = seriesApp.deleteSeriesTest("999");
     assertFalse(deleted); 
   }
   @Test
   public void testSeriesAgeRestriction_AgeValid()
   {
       assertTrue(seriesApp.isAgeValid(5));
       assertTrue(seriesApp.isAgeValid(18));
   }
   @Test
   public void testSeriesAgeRestriction_AgeInvalid()
   {
      assertFalse(seriesApp.isAgeValid(1));
      assertFalse(seriesApp.isAgeValid(20));
   }
}
